package fr.blackbird.demo

import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.when
import org.scalatest.mockito.MockitoSugar
import org.scalatest.{FunSuite, Matchers}
import org.assertj.core.api.Assertions.assertThat

class UserActionUTestWithFunSuite extends FunSuite with Matchers with MockitoSugar {

  val mockedLoginService = mock[LoginService]
  val userAction = new UserAction(mockedLoginService)

  test("displayActionsPerformed_shouldReturnSUCCESS_whenUserListIsNotEmpty") {
    // Given
    val userActionList = List("user logged in", "user updated profile")
    when(mockedLoginService.getListOfActionsPerformed(any[String])).thenReturn(userActionList)

    // When
    val result = userAction.displayActionsPerformed("userId_01")

    // Then
    assertThat(result).isEqualTo("SUCCESS")
  }

  test("displayActionsPerformed_shouldReturnFAILED_whenUserListIsEmpty") {
    // Given
    val userActionList = List.empty
    when(mockedLoginService.getListOfActionsPerformed(any[String])).thenReturn(userActionList)

    // When
    val result = userAction.displayActionsPerformed("userId_01")

    // Then
    assertThat(result).isEqualTo("FAILED")
  }


}
