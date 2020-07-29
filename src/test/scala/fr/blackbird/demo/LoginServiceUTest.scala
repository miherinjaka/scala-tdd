package fr.blackbird.demo

import org.scalatest.FunSuite
import org.assertj.core.api.Assertions.assertThat

class LoginServiceUTest extends FunSuite {

  private val loginService = new LoginService()

  test("getListOfActionsPerformed_shouldReturnExpectedList_whenArgIsNotEmpty") {
    // Given
    val userId = "userId_1"

    // When
    val result = loginService.getListOfActionsPerformed(userId)

    // Then
    assertThat(result).isNotEqualTo(List.empty)
    assertThat(result.size).isEqualTo(2)
    assertThat(result).isEqualTo(List("User Action 1", "User Action 2"))
  }

  test("getListOfActionsPerformed_shouldReturnEmptyList_whenArgIsEmpty") {
    // Given
    val userId = ""

    // When
    val result = loginService.getListOfActionsPerformed(userId)

    // Then
    assertThat(result).isEqualTo(List.empty)
    assertThat(result.size).isEqualTo(0)
  }

}
