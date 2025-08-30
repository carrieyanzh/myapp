package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Docker World! 🐳");
    System.out.println("Application is running on port 8080");

    // Simple HTTP server simulation
    try {
      while (true) {
        System.out.println("App is running... " + new java.util.Date());
        Thread.sleep(10000); // Wait 10 seconds
      }
    } catch (InterruptedException e) {
      System.out.println("Application stopped");
    }
  }
}
