import java.time.LocalDateTime; // import the LocalDateTime class

public class CurrentDateTime {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
