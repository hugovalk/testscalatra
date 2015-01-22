import nl.ibridge.scalatratest.app._
import org.scalatra._
import javax.servlet.ServletContext

//test git
class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")
  }
}
