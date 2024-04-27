package hello.kotlinlearning.basicGrammar;

public class Java_If {
  public static void main(String[] args) {
    int age = 13;

    // 자바의 if-else문은 값을 반환할 수 없다.
    String str = "";
    if (age > 13) {
      str = "성인";
    } else {
      str = "아이";
    }

    System.out.println(str);

  }
}
