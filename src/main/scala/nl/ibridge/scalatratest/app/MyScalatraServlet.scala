package nl.ibridge.scalatratest.app

import org.scalatra._
import scalate.ScalateSupport
import nl.ibridge.scalatratest.app.util.JsonSupport
import nl.ibridge.scalatratest.model.Result

class MyScalatraServlet extends TestScalatraStack with JsonSupport {
  
  get("/data") {
    val data = Result.all
    Result(params.get("functie") match {
      case Some(f) => data.filter { d => d.key == "functie" && d.value.toLowerCase().contains(f) }
      case None => data
    })
  }
  
  get("/data/:id") {
    Result.all.find { _.id.toString() == params("id") }
  }
}




