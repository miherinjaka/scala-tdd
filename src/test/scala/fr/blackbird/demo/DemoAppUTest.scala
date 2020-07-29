package fr.blackbird.demo

import org.scalatest.FunSuite
import org.scalatest.mockito.MockitoSugar
import org.assertj.core.api.Assertions.assertThat

class DemoAppUTest extends FunSuite with MockitoSugar {

  private val demoApp = new DemoApp()


  test("cube_shouldReturnZero_whenArgIsEqualsToZero") {
    // Given
    val x = 0

    // When
    val result = demoApp.cube(x)

    // Then
    assertThat(result).isEqualTo(0)
  }

  test("cube_shouldReturnExpectedResult_whenArgIsNotEqualsToZero") {
    // Given
    val x = 3

    // When
    val result = demoApp.cube(x)

    // Then
    assertThat(result).isEqualTo(27)
  }

  test("multiply_shouldReturnZero_whenFirstArgIsEqualToZero") {
    // Given
    val x:Int = 0
    val y:Int = 5

    // When
    val result = demoApp.multiply(x, y)

    // Then
    assertThat(result).isEqualTo(0)
  }

  test("multiply_shouldReturnZero_whenSecondArgIsEqualToZero") {
    // Given
    val x:Int = 9
    val y:Int = 0

    // When
    val result = demoApp.multiply(x, y)

    // Then
    assertThat(result).isEqualTo(0)
  }

  test("multiply_shouldReturnExpectedResult_whenArgsNotEqualToZero") {
    // Given
    val x:Int = 9
    val y:Int = 5

    // When
    val result = demoApp.multiply(x, y)

    // Then
    assertThat(result).isEqualTo(45)
  }



}
