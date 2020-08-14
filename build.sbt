name := "dailyapp"
 
version := "1.0" 
      
lazy val `dailyapp` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

// @see(https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html)
scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  ehcache,
  ws,
  guice,
  "com.typesafe.play"       %% "play-slick"             % "5.0.0",
  "com.typesafe.play"       %% "play-slick-evolutions"  % "5.0.0",
  "mysql"                    % "mysql-connector-java"   % "8.0.21",
  "org.scalatestplus.play"  %% "scalatestplus-play"     % "5.0.0" % Test
)

// unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

