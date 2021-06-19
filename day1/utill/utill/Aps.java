package utill;

import java.util.Scanner;
public class Aps {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    int kq = number;
    int count = 0;
    while(kq != 0) {
      kq = number / 10;
      number = kq;
      count++;
      System.out.println("  " +kq);
      
    }
  }
}