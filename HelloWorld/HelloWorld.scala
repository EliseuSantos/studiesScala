import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
object HelloWorld {
    def main(args: Array[String]) {
        val now = new Date
        val df = getDateInstance(LONG, Locale.ROOT)
        println("Hello, World")
        println( df format now)
    }
}
