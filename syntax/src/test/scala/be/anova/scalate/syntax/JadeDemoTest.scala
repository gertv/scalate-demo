/*
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 16/03/11
 * Time: 10:41
 */
package be.anova.scalate.syntax

import org.junit.Test

class JadeDemoTest {

  import TestSupport.engine

  @Test
  def testJadeTemplate = {
    println(engine.layout("/jade_demo.jade", Map("order" -> Orders.planes)))
  }

}