package fr.blackbird.demo

class LoginService {

  private val userAction1 = "User Action 1"
  private val userAction2 = "User Action 2"

  def getListOfActionsPerformed(userId: String):List[String] = {
    if(!userId.isEmpty) {
      List(userAction1, userAction2)
    } else {
      List.empty
    }
  }
}
