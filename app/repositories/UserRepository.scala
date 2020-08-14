package repositories

import com.google.inject.Singleton
import repositories.Tables._
import slick.jdbc.MySQLProfile.api._
import slick.dbio.DBIO


@Singleton
class UserRepository {
  def getAllUsers: DBIO[Seq[User]] = {
    Users.result
  }
}
