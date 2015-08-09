name := """play-jpa"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.springframework" % "spring-context" % "4.0.4.RELEASE",
  "org.springframework" % "spring-orm" % "4.0.4.RELEASE",
  "javax.inject" % "javax.inject" % "1",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final", // replace by your jpa implementation
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api")
)
