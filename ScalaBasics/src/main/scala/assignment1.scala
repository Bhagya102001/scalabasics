import scala.util.Random
import scala.io.StdIn
object PasswordCreator {

  def createSecureCode(desiredLength: Int): String = {
    val smallAlphabets = "abcdefghijklmnopqrstuvwxyz"
    val capitalAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val digitValues = "0123456789"
    val specialSymbols = "!@#$%^&*()_+-=[]{}|;:,.<>?"

    val allPossibleChars = smallAlphabets + capitalAlphabets + digitValues + specialSymbols
    val randomizer = new Random()

    val password = (1 to desiredLength).map { _ =>
      allPossibleChars(randomizer.nextInt(allPossibleChars.length))
    }.mkString("")

    password
  }

  def main(args: Array[String]): Unit = {
    val codeLength = 8
    val generatedSecureCode = createSecureCode(codeLength)
    println(s"Generated Secure Code: $generatedSecureCode")
  }
}