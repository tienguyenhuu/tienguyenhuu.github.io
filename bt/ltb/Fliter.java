package ltb;

import java.util.Scanner;

public class Fliter {
    public static void Flr(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String fliter = input.nextLine();
        fliter = fliter.replaceAll("fuck|Fuck", "f*ck");
        fliter = fliter.replaceAll("sex|Sex", "s*x");
        fliter = fliter.replaceAll("rape|Rape", "r*pe");
        fliter = fliter.replaceAll("shit|Shit", "s*it");
        fliter = fliter.replaceAll("bitch|Bitch", "b*tch");
        fliter = fliter.replaceAll("damn|Damn", "d*mn");
        System.out.println(fliter);
    }
}
