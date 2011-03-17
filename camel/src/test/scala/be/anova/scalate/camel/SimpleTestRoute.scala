package be.anova.scalate.camel

import org.apache.camel.test.junit4.CamelTestSupport
import org.apache.camel.scala.dsl.builder.{RouteBuilder, RouteBuilderSupport}
import org.junit.Test
import be.anova.scalate.model.Orders
import scala.collection.JavaConversions._
import org.apache.camel.Exchange

class SimpleTestRoute extends CamelTestSupport with RouteBuilderSupport {

  @Test
  def simpleScalateTest = {
    val mock = getMockEndpoint("mock:test")
    mock.expectedMessageCount(1)

    template.sendBody("direct:test", Orders.planes)

    assertMockEndpointsSatisfied

    for (exchange <- mock.getExchanges) println(exchange)

  }

  override def createRouteBuilder = routes

  val routes = new RouteBuilder {

    "direct:test" ==> {
      to("log:test")
      to("scalate:create_mail.ssp")
      to("mock:test")
    }

  }

  val notify_by_mail =

  //START SNIPPET: routebuilder
  new RouteBuilder {

    "activemq:confirmed.orders" ==> {
      to("scalate:create_mail.ssp")
      to("smtp:out.telenet.be")
    }
  }
  //END SNIPPET: routebuilder
}