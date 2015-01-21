package nl.ibridge.scalatratest.repository

import com.sksamuel.elastic4s.ElasticDsl._
import com.sksamuel.elastic4s.mappings.FieldType._
import com.sksamuel.elastic4s.ElasticClient
import scala.concurrent.Future
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse
import scala.concurrent.ExecutionContext.Implicits.global
import nl.ibridge.scalatratest.model.Data


/**
 * @author HV01016
 */
trait DataRepository {
  
  def client: ElasticClient
  
  def createIndex(): Future[Boolean] = client.execute {
    create index "data" mappings {
      "data" as {
        "id" typed IntegerType
      }
    }
  }.map(_.isAcknowledged())
  
  def deleteIndex(): Future[Boolean] = client.execute {
    delete index ("data")
  }.map(_.isAcknowledged())
  
  def indexStatus() = client.execute {
    status("data")
  }
  
  def saveOrUpdate(data: Data): Future[Boolean] = client.execute {
    index into "data" doc data
  }.map(_.isCreated())
  
}