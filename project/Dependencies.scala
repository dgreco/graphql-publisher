import sbt._

object Dependencies {
  lazy val mustache      = "com.github.spullara.mustache.java" % "compiler"        % "0.9.14"
  lazy val bck           = "org.bouncycastle"                  % "bcprov-jdk15on"  % "1.70"
  lazy val jwt           = "com.auth0"                         % "java-jwt"        % "4.5.2"
  lazy val catsCore      = "org.typelevel"                    %% "cats-core"       % "2.13.0"
  lazy val catsKernel    = "org.typelevel"                    %% "cats-kernel"     % "2.13.0"
  lazy val catsFree      = "org.typelevel"                    %% "cats-free"       % "2.13.0"
  lazy val sangria       = "org.sangria-graphql"              %% "sangria"         % "4.2.18"
  lazy val sangriaCirce  = "org.sangria-graphql"              %% "sangria-circe"   % "1.3.2"
  lazy val pekkoHttp      = "org.apache.pekko"                 %% "pekko-http"       % "1.3.0"
  lazy val pekkoStream    = "org.apache.pekko"                 %% "pekko-stream"     % "1.4.0"
  lazy val pekkoHttpCirce = "com.github.pjfanning"             %% "pekko-http-circe" % "3.7.0"
  lazy val circeCore     = "io.circe"                         %% "circe-core"      % "0.14.15"
  lazy val circeParser   = "io.circe"                         %% "circe-parser"    % "0.14.15"
  lazy val circeOptics   = "io.circe"                         %% "circe-optics"    % "0.14.1"

  lazy val hiveJdbc = ("org.apache.hive" % "hive-jdbc" % "3.1.3000.7.2.12.2-5").exclude("org.slf4j", "slf4j-log4j12")
    .exclude("org.apache.logging.log4j", "log4j-slf4j-impl").exclude("org.apache.logging.log4j", "log4j-1.2-api")
    .exclude("log4j", "log4j")

  lazy val loggingDependencies = Seq(
    "org.apache.logging.log4j" % "log4j-api"       % "2.24.3",
    "org.apache.logging.log4j" % "log4j-web"       % "2.24.3",
    "org.apache.logging.log4j" % "log4j-core"      % "2.24.3",
    "ch.qos.logback"           % "logback-classic" % "1.5.32",
    "org.slf4j"                % "slf4j-api"       % "2.0.18"
  )

  lazy val h2Db      = "com.h2database" % "h2"        % "2.4.240"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.20"
}
