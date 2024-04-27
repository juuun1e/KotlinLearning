package hello.kotlinlearning.basicGrammar

fun main(){

  // java switch문 코드를 kotlin의 when식으로 변환한 코드(컨버팅)
  val day = 2

  val result = when (day) { // when 조건에 맞는 결과를 그대로 리턴
    1 -> "월요일"
    2 -> "화요일"
    3 -> "수요일"
    4 -> "목요일"
    else -> "기타"
  }
  println(result)


  // else 생략 가능 : when식 조건에 들어가는 enum 클래스가 리턴할 수 있는 값 한정되어 있음 -> 이 또한 코틀린 컴파일러가 추론해줌
  when(getColor()) {
    Color.RED -> print("red")
    Color.GREEN -> println("green")
  //else -> println("bule") 블루 추가했을 때 else 넣어 작성해도 당연히 된다!
  }


  // 여러 조건을 콤마(,)로 구분하여 한줄에서 정의 가능
  when (getNumber()) {
    0, 1 -> print("0 or 1")
    else -> print("Not 0 or 1")
  }
}

enum class Color {
  RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2