package fr.blackbird.demo

class UserAction(loginService: LoginService) {

  def displayActionsPerformed(userId: String): String = {
    val result = loginService.getListOfActionsPerformed(userId)
    if (result.size > 0) {
      "SUCCESS"
    } else {
      "FAILED"
    }
  }

}
