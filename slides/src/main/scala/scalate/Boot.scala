package scalate

/*
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 15/03/11
 * Time: 22:31
 */
import org.fusesource.scalate.wikitext.Snippets;

class Boot {

  def run() = {
    Snippets.addPrefix("servlets", "../servlets")
  }


}