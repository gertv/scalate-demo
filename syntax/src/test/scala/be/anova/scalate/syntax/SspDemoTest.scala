/*
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 16/03/11
 * Time: 10:41
 */
package be.anova.scalate.syntax

import org.junit.Test
import be.anova.scalate.model.Orders

class SspDemoTest {

  import TestSupport.engine

  @Test
  def testSspTemplate = {
    println(
      // START SNIPPET: embedding
  engine.layout("/ssp_demo.ssp", Map("order" -> Orders.planes))
      // END SNIPPET: embedding
    )
  }

  @Test
  def testSspTemplateALaVelocity = {
    println(engine.layout("/ssp_demo_a_la_velocity.ssp", Map("order" -> Orders.planes)))
  }

}