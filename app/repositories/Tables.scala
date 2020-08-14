package repositories

import slick.jdbc.GetResult
import slick.jdbc.MySQLProfile.api._

// @see(https://alvinalexander.com/scala/play-framework-convert-seq-sequence-scala-objects-to-json/?ref=driverlayer.com/web)

trait Tables {
  case class User(id: Long, username: String, password: String)

  implicit lazy val getUserResult = GetResult { r =>
    User(r.<<, r.<<, r.<<)
  }

  class Users(tag: Tag) extends Table[User](tag, "users") {
    def id = column[Long]("id", O.PrimaryKey)
    def username = column[String]("username")
    def password = column[String]("password")

    def * = (id, username, password) <> (User.tupled, User.unapply)
  }

  object Users extends TableQuery(new Users(_))
}

object Tables extends Tables