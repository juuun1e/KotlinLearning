package hello.kotlinlearning.basicGrammar

fun main() {
/*  val a : String = null // 컴파일 오류

  val b : String = "aabbvv"
  b = null // 컴파일 오류               */


  // 코틀린은 null을 허용하는 Nullable 타입을 제공
  // Nullable 참조에 대한 접근 : safe-call(안전연산자) 사용
  val a : String? = null
  println(a?.length)


  // 삼항 연산자 대신 if-else식 => null에 대한 조건이 들어왔을 때 값을 반환하는 방식
  val b : Int = if (a != null) a.length else 0
  println(b)

  // if-else보다 더 간단한 엘비스 연산자로 null처리 => 좌변이 null인 경우 우변을 리턴
  val c = a?.length ?: 0
  println(c)


  // 코틀린에서의 NPE 발생
  // 명시적 NPE 직접적 호출
  throw NullPointerException()

  // !! NotNull임을 단언하는 단언 연산자 사용
//  val d: String? = null
//  val e = d!!.length

}