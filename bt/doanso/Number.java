package doanso;

import java.util.Scanner;

public class Number {
    public static void nb(){
        int rdNumbers = (int)(Math.random()*100 + 1);
        int count = 1;
        while (true){
        Scanner input = new Scanner(System.in);
        System.out.println("Số bạn muốn đoán là");
        int number;
        number = input.nextInt();
        if (number < rdNumbers){
            System.out.println("   Số bạn nhập bé quá   ");
            count= count + 1;
            continue;
        }
        if (number > rdNumbers){
            System.out.println("   Số bạn nhập lớn quá   ");
            count= count + 1;
            continue;
        }
        if (number == rdNumbers){
            System.out.println(" chúc mừng bạn đã đoán đúng - bạn mất : " + count + " lần để đoán đúng");
            break;
        }
    }
}
}
