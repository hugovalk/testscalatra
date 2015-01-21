package nl.ibridge.scalatratest.repository.elasticsearch

import com.sksamuel.elastic4s.ElasticClient
import org.elasticsearch.node.NodeBuilder

/**
 * @author HV01016
 */
trait LocalElasticSearch {
  
  val node = NodeBuilder.nodeBuilder().local(true).build().start()
  
  val client = ElasticClient.fromNode(node)
  
}