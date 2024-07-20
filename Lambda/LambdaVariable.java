interface StringVariable {
  String run(String str);
}

public class LambdaVariable {
  public static void main(String[] args) {
    StringVariable exclaim = (s) -> s + "!";
    StringVariable ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }

  public static void printFormatted(String str, StringVariable format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
