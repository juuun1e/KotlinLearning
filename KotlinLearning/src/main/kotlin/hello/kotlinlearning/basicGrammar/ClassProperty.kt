package hello.kotlinlearning.basicGrammar

// 1. class 키워드로 클래스 선언
// 3. constructor 키워드로 기본 생성자 -> 키워드 생략 가능 : 가독성 향상
class Coffe (val name: String){

}


// 2. 코틀린의 클래스는 본문 생략 가능 : 본문 내용이 없는 클래스
class EmptyClass


// 4. 클래스에 프로퍼티 선언 시 [ 후행쉽표 trailing comma ] 사용 가능 -> 뒤에 필드가 없어도 콤마
// : 마지막 줄의 프로퍼티(price)를 수정하지 않고 간편한 방법으로 새로운 프로퍼티 추가할 수 있다.(코드리뷰 diff 에도 유용)
class Coffee(
  val name: String,
  val price: Int, // trailing comma
  )


// 5. 프로퍼티 선언은 val(불변 - getter만 존재) 또는 var(가변) 키워드 모두 가능
// 6. 따로 getter setter의 코드가 보이지 않지만 코틀린의 컴파일러가 자동 생성
class Coffeee(
  var name: String = "", // 기본 값 추가
  var price: Int = 0,
  var iced: Boolean = false,
) {
  // 커스텀 getter
  val brand: String
    get() = "풀바셋"

  // 커스텀 setter
  var quantity: Int = 0
    set(value) {
      if (value > 0) { // 수량이 0 이상인 경우에만 값을 할당
        field = value  // field라는 식별자로 필드의 참조에 접근 : Backing Field에 접근한다
      // quantity = value -> 재귀 호출로 인한 StackOverflow 발생
    }
  }
}


// 6. 프로퍼티를 수정 또는 사용하고 싶다면 참조
fun main() {
  val coffeee = Coffeee()
  coffeee.name = "Americano"
  coffeee.price = 5000
  coffeee.quantity = 1
  coffeee.iced = true

  // 코틀린의 프로퍼티는 자바보다 객체지향적이다.
  // 자바에서는 상태를 메서드 coffeee.isIced()로 표현하는 반면, 코틀린은 프로퍼티로 상태 표현
  if (coffeee.iced) {
    println("ice coffee")
  }
  println("${coffeee.brand} ${coffeee.name} ${coffeee.quantity}잔 가격은 ${coffeee.price}원 입니다.")
}