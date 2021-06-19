import java.util.Scanner;

public class StringUtil {
/* Kiểm tra strB có trong strA hay không*/
    public static void isContain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào strA");
        String StrA = input.nextLine();
        System.out.println("Nhập vào strB");
        String StrB = input.nextLine();
        final int length =StrB.length();
        if(length == 0) {
            System.out.println("true");
        }
            final char firstLo = Character.toLowerCase(StrB.charAt(0));
            final char firstUp = Character.toUpperCase(StrB.charAt(0));
            for(int i = StrA.length() - length; i >= 0; i--) {
                final char ch = StrA.charAt(i);
                if(ch != firstLo && ch != firstUp)
                continue;
                if(StrA.regionMatches(true, i, StrB, 0, length))
                System.out.println("B có chứa A");
            }
        
    }
    /*Nghịc đảo chuỗi */
    public static void reverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần nghịc đảo");
        String rvse = input.nextLine();
        String reverse ="";
        for(int i = rvse.length() - 1 ; i>=0 ; i--)
        reverse = reverse + rvse.charAt(i);
        System.out.println("Nghịc đảo thành "+ reverse);
    }
    /*Vị trí chuỗi */
    public static void find(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi A");
        String stra = input.nextLine();
        System.out.println("Nhập vào chuỗi cần tìm vị trí");
        String strb = input.nextLine();
        int location = stra.indexOf(strb);
        if(location == -1){
            System.out.println("Không có chuỗi này trong A");
        }
        else{
            System.out.println("vị trí là: " + location);
        }
    }
    /*Viết hoa chữ cái đầu */
    public static void camelCase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String cle = input.nextLine();
        StringBuffer camelCase = new StringBuffer();

    String[] strArr = cle.split(" ");
    for (String str : strArr) {
        char[] stringArray = str.trim().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        str = new String(stringArray);

        camelCase.append(str).append(" ");
    }

    System.out.print(": "+camelCase.toString().trim());
}
    /*Tìm từ dài nhất */
    public static void longestword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào đoạn văn"); 
        String paragraph =input.nextLine();
        String [] word = paragraph.split( " " );
        int index = 0;
        int lenghtMax =0;
        for( int i = 0 ; i < word.length; i++){
            int length = word[i].length();
            if( length > lenghtMax){
                lenghtMax = length;
                index = i;
            }
        }
        System.out.println("Từ dài nhất là: " + word[index]);
    }
    /*Đếm số từ */
    public static void countwords(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào đoạn văn");
        String paragraph = input.nextLine();
        String[] words = paragraph.split( " " );
        }
    
}
    
