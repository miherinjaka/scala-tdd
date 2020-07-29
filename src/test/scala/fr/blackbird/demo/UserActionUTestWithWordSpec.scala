package fr.blackbird.demo

import org.scalatest.mockito.MockitoSugar
import org.scalatest.{Matchers, WordSpec}
import org.mockito.Mockito.when
import org.mockito.ArgumentMatchers.any


class UserActionUTestWithWordSpec extends WordSpec with Matchers with MockitoSugar {

  val mockedLoginService = mock[LoginService]
  val userAction = new UserAction(mockedLoginService)

  "UserAction#displayActionsPerformed" should {
    "return SUCCESS" in {
      when(mockedLoginService.getListOfActionsPerformed(any[String])) thenReturn List("user logged in", "user updated profile")
      val result = userAction.displayActionsPerformed("userId1")
      result shouldBe "SUCCESS"
    }
  }

  "UserAction#displayActionsPerformed" should {
    "return FAILED" in {
      when(mockedLoginService.getListOfActionsPerformed(any[String])) thenReturn List.empty
      val result = userAction.displayActionsPerformed("userId1")
      result shouldBe "FAILED"
    }
  }

}
