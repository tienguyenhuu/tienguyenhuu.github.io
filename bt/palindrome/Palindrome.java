package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void Ple(){
        while(true){
            String reverse ="";
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập vào từ cần kiểm tra");
            String  palindrome = input.nextLine();
            for (int i = palindrome.length() -1 ; i >= 0 ; i-- )
                reverse = reverse + palindrome.charAt(i);
                if(palindrome.equals(reverse)){
                    System.out.println(reverse + " là chuỗi đối xứng" );
                    continue;
                }
                else{
                    System.out.println(reverse + " không phải là chuỗi đối xứng");
                    break;
                }
    }
}
}
