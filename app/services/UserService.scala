package services

import com.google.inject.{Inject, Singleton}
import models.UserForList
import repositories.UserRepository
import repositories.Tables.User
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.{ExecutionContext, Future}

// repository で返ってきたテーブルデータを、models に宣言した case class で適切にラップして controller に返す

@Singleton
class UserService @Inject()(
  val userRepository: UserRepository
)(implicit val ec: ExecutionContext){

  val db = Database.forConfig("slick.dbs.default")

  def getUsers: Future[Seq[UserForList]] = {
    for {
      users <- db.run(userRepository.getAllUsers)
    } yield {
      users.map { user =>
        UserForList(id = user.id, username = user.username)
      }
    }
  }
}
