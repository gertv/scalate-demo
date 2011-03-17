package be.anova.scalate.jaxrs.resources

import com.sun.jersey.api.view.ImplicitProduces

import be.anova.scalate.model.Orders
import javax.ws.rs.{GET, Path}

@Path("/order")
@ImplicitProduces(Array("text/html;qs=5"))
class OrderResource {

  lazy val order = Orders.planes

  @GET
  def get = order

}