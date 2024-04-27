package hello.kotlinlearning.basicGrammar;

// switch문 : 키워드 switch-case로 조건 분기
// 표현식이기에 반환할 수 없음 --> 최신java에서 코틀린의 when식처럼 반환하는 switch식 지원
public class Java_Switch {
  public static void main(String[] args) {
    int day = 2;
    String result = "";
    switch (day) {
      case 1:
        result = "월요일";
        break;
      case 2:
        result = "화요일";
        break;
      case 3:
        result = "수요일";
        break;
      case 4:
        result = "목요일";
        break;
      case 5:
        result = "금요일";
        break;
      case 6:
        result = "토요일";
        break;
      case 7:
        result = "일요일";
        break;
      default:
        result = "error";
        break;
    }
    System.out.println(result);
  }
}
