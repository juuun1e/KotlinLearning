package hello.kotlinlearning.basicGrammar;

public class Java_Exception {
  public static void main(String[] args) {

    // checkedException 컴파일 에러 발생 -> 무조건 try-catch로 감싸거나 throws 예외 전파
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      // 예외처리
    }
  }
}
