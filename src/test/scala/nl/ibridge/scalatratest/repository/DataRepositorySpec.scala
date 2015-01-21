package nl.ibridge.scalatratest.repository

import nl.ibridge.scalatratest.repository.elasticsearch.LocalElasticSearch
import scala.concurrent._
import scala.concurrent.duration._
import scalaz.concurrent.Promise
import org.scalatest._
import nl.ibridge.scalatratest.model.Data

class DataRepositorySpec extends FlatSpec with Matchers with BeforeAndAfterAll {

  
	val repo = new DataRepository() with LocalElasticSearch
  
  
  "The repo" should "be able to create the data index" in {
      val res = repo.createIndex()
      Await.result(res, Duration("10 s")) should be(true)
      
  }
  
//  it should "be able to index a Data object" in {
//      val data = new Data(1, "functie", "tester")
//      val res = repo.saveOrUpdate(data)
//      Await.result(res, Duration("10 s")) should be(true)
//  }
  
  it should "be able to delete the data index" in {
      val res = repo.deleteIndex()
      Await.result(res, Duration("10 s")) should be(true)
  }
  
  override def afterAll() = {
    repo.node.close()
  }
}