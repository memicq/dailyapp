package controllers

import javax.inject.{Inject, Singleton}
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import services.UserService

import scala.concurrent.ExecutionContext

@Singleton
class UserController @Inject()(
  cc: ControllerComponents,
  val userService: UserService
) (implicit val ed: ExecutionContext) extends AbstractController (cc){

  def index(): Action[AnyContent] = Action.async { implicit rs =>
    userService.getUsers.map { users =>
      Ok(Json.toJson(users))
    }
  }
}
