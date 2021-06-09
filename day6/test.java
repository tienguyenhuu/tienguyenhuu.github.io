import java.util.Scanner;

public class test {
    public static void main(String args[])
    {
        while (true){
        String reverseString="";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String inputString = input.nextLine();
        int length = inputString.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + inputString.charAt(i);
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }
}
}

