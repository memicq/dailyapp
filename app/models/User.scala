package models

import play.api.libs.json._

// UserForList
case class UserForList(
  id: Long,
  username: String
)
object UserForList {
  implicit val jsonWrites = Json.writes[UserForList]
}
