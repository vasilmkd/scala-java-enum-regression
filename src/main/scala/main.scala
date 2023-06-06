import com.intellij.openapi.compiler.CompilerMessageCategory

object main {
  def doSomething(category: CompilerMessageCategory): Unit = {
    val messageType = category match {
      case CompilerMessageCategory.ERROR => "error"
      case CompilerMessageCategory.WARNING => "warning"
      case CompilerMessageCategory.INFORMATION => "information message"
      case CompilerMessageCategory.STATISTICS => "statistics message"
    }
    println(messageType)
  }

  def main(args: Array[String]): Unit = {
    doSomething(CompilerMessageCategory.ERROR)
  }
}
