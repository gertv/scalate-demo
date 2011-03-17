/*
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 16/03/11
 * Time: 10:41
 */
package be.anova.scalate.syntax

import org.junit.Test
import be.anova.scalate.model.Orders

class ScamlDemoTest {

  import TestSupport.engine

  @Test
  def testScamlTemplate = {
    println(engine.layout("/scaml_demo.scaml", Map("order" -> Orders.whiskies)))
  }
}