public class ThreadIsAlive extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    ThreadIsAlive thread = new ThreadIsAlive();
    thread.start();

    while (thread.isAlive()) {
      System.out.println("Waiting...");
    }

    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }

  public void run() {
    amount++;
  }
}
