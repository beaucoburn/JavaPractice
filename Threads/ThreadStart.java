public class ThreadStart extends Thread {
  public static void main(String[] args) {
    ThreadStart thread = new ThreadStart();
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  public void run() {
    System.out.println("This code is running in a thread");
  }
}
