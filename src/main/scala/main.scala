import com.intellij.openapi.compiler.CompilerMessageCategory
import com.intellij.compiler.ModuleSourceSet

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

  def doSomethingSimple(moduleSourceType: ModuleSourceSet.Type): Unit = {
    val something = moduleSourceType match {
      case ModuleSourceSet.Type.TEST => "test"
      case ModuleSourceSet.Type.RESOURCES => "res"
      case ModuleSourceSet.Type.PRODUCTION => "prod"
      case ModuleSourceSet.Type.RESOURCES_TEST => "res_test"
    }
    println(something)
  }

  def main(args: Array[String]): Unit = {
    doSomething(CompilerMessageCategory.ERROR)
    doSomethingSimple(ModuleSourceSet.Type.RESOURCES)
  }
}
