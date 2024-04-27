package hello.kotlinlearning.basicGrammar

// 1. 기본적인 함수 선언 스타일
// fun 함수명(인자:타입, 인자:타입) : 반환 타입 { return 결과 }
fun sum(a: Int, b: Int) : Int {
  return a + b
}

// 2. 표현식 스타일 : {몸통} 없이 로직만, 값을 만들어 낼 수 있음
fun sum2(a: Int, b: Int) : Int = a + b

// 3. 표현식 & 반환타입 생략 -> 함수가 반환할 타입을 컴파일러가 추론
fun sum3(a: Int, b: Int) = a + b

// 4. {몸통}이 있는 함수는 반환 타입을 제거하면 컴파일 오류
fun sum4(a: Int, b: Int) : Int {
  return a + b     // : 반환타입 제거 시 컴파일 오류
}

// 5. 반환형 없는 경우 자동으로 Unit이 반환타입 == 자바와 비교하자면 void와 유사
fun printSum(a: Int, b: Int) {
  println("$a 더하기 $b = ${a + b}")
}

// 6. 디폴트 파라미터_자바에는 없는 기능
fun greeting(message: String = "안녕하세요!!") {
  println(message)
}

fun main2() {
  greeting() // 인자가 없을 때 디폴트 파라미터에 할당하는 "안녕하세요!!" 출력
  greeting("Halo!@@")
}

fun log(level: String = "INFO", message: String) {
  println("[$level]$message")
}

// 7. 네임드 아규먼트 : 함수에 변수 값을 넣을 때 (이름="값") 매핑하는 기법
fun log2(level: String = "INFO", message: String) {
  println("[$level]$message")
}

fun main(){
  log(message = "인포 로그")
  log(level = "DEBUG", "디버그 로그")
  log("WARN", "워닝 로그") // 네임드 아규먼트 기법 사용하지 않고 스트링값 할당
  log(level = "ERROR", message = "에러 에러 에러")
}

// 코틀린의 함수는 자바 메서드보다 간결하게 작성 가능하며 디폴트 파라미터, 네임드아규먼트 기법은 굉장히 유용
// 코틀린은 변수와 마찬가지로 따로 클래스가 없어도 탑레벨에 위치할 수 있어 간편