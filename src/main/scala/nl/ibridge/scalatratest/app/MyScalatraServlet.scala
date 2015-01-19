package nl.ibridge.scalatratest.app

import org.scalatra._
import scalate.ScalateSupport
import nl.ibridge.scalatratest.app.util.JsonSupport


class MyScalatraServlet extends TestScalatraStack with JsonSupport {
  
  get("/") {
    Result(AllData.all)
  }
  
  post("/get") {
    
  }
  
  case class Data(id: String, value: Int)
  case class Result(data: List[Data])
  
  object AllData{
    val all = List(
        Data("functie1", 1),
        Data("functie2", 3)
        )
  }
}


