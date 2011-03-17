/*
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 16/03/11
 * Time: 10:41
 */
package be.anova.scalate.syntax

import org.junit.Test

class SspDemoTest {

  import TestSupport.engine

  @Test
  def testSspTemplate = {
    println(
      // START SNIPPET: embedded
      engine.layout("/ssp_demo.ssp", Map("order" -> Orders.planes))
      // END SNIPPET: run embedded
    )
  }

  @Test
  def testSspTemplateALaVelocity = {
    println(engine.layout("/ssp_demo_a_la_velocity.ssp", Map("order" -> Orders.planes)))
  }

}