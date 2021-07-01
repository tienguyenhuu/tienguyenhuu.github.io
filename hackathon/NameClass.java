import java.util.Scanner;

public class NameClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào Tên các bạn cùng lớp");
        String cle = input.nextLine();
        StringBuilder camelCase = new StringBuilder();
        cle = cle.toLowerCase();
    String[] strArr = cle.split(" +");
    for (String str : strArr) {
        char[] stringArray = str.trim().toCharArray();
        stringArray[0] = Character.toUpperCase(stringArray[0]);
        str = new String(stringArray);
        
        camelCase.append(str).append(" ");
    }

    System.out.print(": "+camelCase.toString().trim());

        }
    }

//     import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class NameClass {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         List<String> names = new ArrayList<>();
//        while(true){
//         System.out.println("Nhập vào Tên các bạn cùng l hoặc gõ 'q' để thoát");
//         String cle = input.nextLine();
//         if (cle.equals("q")) {
//           break;
//         } 
//         StringBuilder camelCase = new StringBuilder();
//         cle = cle.toLowerCase();
//     String[] strArr = cle.split(" +");
//     for (String str : strArr) {
//         char[] stringArray = str.trim().toCharArray();
//         stringArray[0] = Character.toUpperCase(stringArray[0]);
//         str = new String(stringArray);
//         camelCase.append(str).append(" ");
//         names.add(cle);
//     }
//        }
//        System.out.println(names);
//         }
//     }



