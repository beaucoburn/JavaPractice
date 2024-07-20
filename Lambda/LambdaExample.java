import java.util.ArrayList;

public class LambdaExample {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach((n) -> {
      System.out.println(n);
    });
  }
}
