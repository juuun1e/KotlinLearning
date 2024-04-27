package hello.kotlinlearning.basicGrammar

fun main(){

  // kotlin에서 제공하는 범위 연산자 .. 를 사용해 for loop 돌리기
  for (i in 0 .. 3 ) {
    println(i)  // 0 1 2 3
  }


  // until을 사용하여 반복
  // ..와 다르게 뒤에 온 숫자는 포함하지 않는다
  for (i in 0 until 3) {
    println(i)  // 0 1 2
  }

  // step : 특정 값 만큼 증가시키면서 반복하고 싶을 때
  for (i in 0 .. 6 step 2) { // 0~6까지 2씩 증가시키면서 반복
    println(i)  // 0 2 4 6
  }

  // downTo : 반대로 감소 시키면서 반복하고 싶을 때
  for (i in 3 downTo 1 ) {
    println(i)  // 3 2 1
  }

  // 전달받은 배열을 반복
  val numbers = arrayOf(7, 8, 9)

  for (i in numbers) {
    println(i)  // 7 8 9
  }
}

