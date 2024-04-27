// 5. 탑-레벨 선언 가능 : 클래스나 함수 바깥에서 선언 가능
// 코틀린에서는 간단한 프로그래밍을 작성할 때 클래스 생성 없이 코드 작성 가능
var top = 5
fun main() {
  top += 1
  println(top)

  // 1. 변수 선언
  val a : Int = 1

  // 2. 타입 생략 -> 코틀린 컴파일러가 변수에 대입될 값을 검사하여 자동으로 추론
  val b = 2

  // 3. 지연 할당 -> 타입 명시 필수!
  val c : Int
  c = 3

  // 4. 코틀린의 변수 선언 시 사용하는 두 가지 키워드
  // val(value) 벨 : 자바의 final처럼 한 번 초기화 후 재할당 불가 == Read only
  // var(variable) 바 : 가변 변수, 초기화 후에도 변경 가능
  var d : String = "Hello"
  d = "World"

  // var e = 123  -> var로 선언하더라도 타입은 고정!
  // e = "hi"     -> 컴파일 오류

}