package hello.kotlinlearning.basicGrammar

fun main1() {
  // 자바와 다르게 Checked Exception을 강제하지 않기 때문에
  // 코틀린의 컴파일러는 try-catch로 감싸지 않아도 오류라고 생각하지 않는다.
  Thread.sleep(1)

}

fun main11() {
  // 개발자에 의해 예외처리 try-catch가 필요한 경우 직접 사용 (필수 아님)
  try {
    Thread.sleep(1)
  } catch (e: Exception) {
    println("에러 발생!!")
  }
}


fun main() {
  // 자바와 마찬가지로 마지막에 수행될 코드를 작성하는 finally 제공
  try {
    throw Exception()
  } catch (e: Exception) {
    println("catch 수행!")
  } finally {
    println("finally 수행!")
  }

  // 자바는 try-catch가 구문으로 되어있어 값을 반환할 수 없지만
  // 코틀린의 경우 표현식 상태로 작성이 가능하기에 값을 전달할 수 있다
  // -> 결과를 변수에 바로 담을 수 있다는 점이 굉장히 유용
  val a = try {
    "1234".toInt()
  } catch (e: Exception) {
    println("catch 동작")
  }
  println(a)

  // 직접 exception을 발생시키려면 throw 사용 가능
  // throw Exception("의도적 예외발생!")
  failFast("코틀린은 throw도 표현식이라 리턴이 가능하다")

  // Nothing type => 이후의 코드는 실행되는 걸 보장하지 않음 Unreachable code
  println("이 메시지가 출력이 될까?")
}

// 코틀린에서 기본적으로 throw를 리턴하게 되면 Nothing 타입을 반환 : 코드가 정상적으로 수행되는 걸 보장하지 않는 경우 Nothing
// 함수에 리턴 타입을 지정하지 않으면 Unit 타입 반환
fun failFast(message: String): Nothing {
  throw IllegalArgumentException(message)
}