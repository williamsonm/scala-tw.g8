val LogbackVersion = "$logback_version$"
val Specs2Version = "$specs_version$"
val TwitterVersion = "$twitter_version$"

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="norm"$",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    libraryDependencies ++= Seq(
      "com.twitter"       %% "finatra-http"                   % TwitterVersion,
      "com.twitter"       %% "finatra-httpclient"             % TwitterVersion,
      "com.twitter"       %% "finagle-stats"                  % TwitterVersion,
      "com.twitter"       %% "inject-server"                  % TwitterVersion,
      "com.twitter"       %% "scrooge-core"                   % TwitterVersion,
      "com.twitter"       %% "twitter-server-logback-classic" % TwitterVersion,
      "com.twitter"       %% "util-core"                      % TwitterVersion,
      "org.specs2"      %% "specs2-core"         % Specs2Version % "test",
      "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
    ),
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full),
    addCompilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
  )

scalacOptions ++= Build.commonScalacOptions
