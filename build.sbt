scalaVersion := "2.13.11"

resolvers += MavenRepository("intellij-repository-releases", "https://www.jetbrains.com/intellij-repository/releases")

libraryDependencies += "com.jetbrains.intellij.java" % "java-compiler" % "231.9011.34" notTransitive()

scalacOptions += "-Werror"
