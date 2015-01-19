package nl.ibridge.scalatratest.app

import org.scalatra._
import scalate.ScalateSupport
import nl.ibridge.scalatratest.app.util.JsonSupport
import nl.ibridge.scalatratest.model.Result

class MyScalatraServlet extends TestScalatraStack with JsonSupport {
  
  get("/") {
    Result(Result.all)
  }
  
  post("/get") {
    
  }
}


