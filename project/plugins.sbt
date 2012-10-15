libraryDependencies += "com.github.siasia" %% "xsbt-web-plugin" % "0.12.0-0.2.11.1"

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.6.2")

addSbtPlugin("io.spray" % "sbt-twirl" % "0.6.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.4")

resolvers += "akka repo" at "http://repo.akka.io/releases/" // to be removed when upgrading to the next sbt-twirl version