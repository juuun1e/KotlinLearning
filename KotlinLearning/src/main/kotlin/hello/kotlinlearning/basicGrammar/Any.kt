package hello.kotlinlearning.basicGrammar

// 1. open 키워드 => 상속 가능한 클래스로 전환
open class Dog {

  // 3-1. open 키워드 => 함수나 프로퍼티의 재정의
  open var age: Int = 0

  open fun bark() {
    println("으르렁 컹컹")
  }
}

// 2. 상속 => 하위클래스 : 상위클래스 선언
class Bulldog() : Dog() {

  // 3-2. override 키워드 => 하위클래스에서 함수나 프로퍼티 재정의
  override var age: Int = 0

  override fun bark() {
    println("왈왈")
  }
}

// 4. 기본 생성자 사용 => 쉽고 간결하게 프로퍼티 재정의 가능
open class HotBulldog(override var age: Int = 0) : Dog() {

  // 5. 하위클래스에서 오버라이드 된 함수나 프로퍼티 => 자동으로 오픈 상태
  // 재정의 못하게 막고 싶다면 override 앞에 final 키워드 사용
  override fun bark() {
    println("왈왈")
  }
}

// 5. 프로퍼티나 함수에 별도의 open키워드가 없어도 하위클래스에서 재정의 가능
class ChildBulldog() : HotBulldog() {
  override var age: Int = 0

  // super키워드 => 상위 클래스의 함수나 프로퍼티 그대로 사용
  override fun bark() {
    super.bark()
  }
}

// 6. 추상클래스의 구현 => abstract 키워드
abstract class Developer {
  abstract var age: Int
  abstract fun code(language: String)
}

// 상위클래스에서 abstract로 추상화한 함수나 프로퍼티는 하위 클래스에서 무조건 구현 해줘야 한다.
class BackendDeveloper(override var age: Int): Developer(){

  override fun code(language: String) {
    println("I code with $language")
  }
}

fun main(){
  val dog = HotBulldog(age = 2)
  println(dog.age)
  dog.bark()
  println()

  val backendDeveloper = BackendDeveloper(age = 26)
  println(backendDeveloper.age)
  backendDeveloper.code(language = "kotlin")
}