package be.anova.scalate.model;

case class Order(val id : Int, val customer: Customer, val lines: Array[OrderLine])
case class Customer(val id: String, val name: String)
case class OrderLine(val article: Article, val quantity: Int)
case class Article(val id: String, val description: String)

object Orders {

  def planes = {
    Order(1,
          Customer("BePlane", "Belgian Airplane Lovers"),
          Array(
            OrderLine(Article("CSN-A0001", "Cessna 172 SkyHawk"), 10),
            OrderLine(Article("PIP-B0012", "Piper Seneca V"), 2),
            OrderLine(Article("BOE-00787", "Boeing 787 Dreamlines"), 1)
          ))
  }

  def whiskies = {
    Order(2,
          Customer("BeWhisky", "Belgian Whisky Lovers"),
          Array(
            OrderLine(Article("TAL-N0011", "Talisker 10 yrs"), 5),
            OrderLine(Article("GFD-09810", "Glenfiddich Snow Phoenix"), 6),
            OrderLine(Article("GMG-00290", "Glenmorangie Signet"), 3)
          ))
  }


}