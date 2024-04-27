package hello.kotlinlearning.basicGrammar

fun main(){

  // if-else 문이 아닌 '식'의 사용
  val job = "Software Developer"

  if (job == "Software Developer") {
    println("멋쟁이 개발자")
  } else {
    println("또 다른 멋쟁이")
  }


  // 코틀린의 if-else 는 '표현식'이다 : 값을 리턴할 수 있다!
  // <-> 자바에서는 구문이기 때문에 값을 리턴할 수 없음.(Java_If.java)
  val age : Int = 10

  val str = if (age > 13) {
    "성인"
  } else {
    "아이"
  }

  // 코틀린은 삼항 연산자가 없다. -> if-else가 표현식이라 불필요 : 보다 쉽게 조건에 대한 처리 가능
  val a = 1
  val b = 2
  val c = if (b > a) b else a

}