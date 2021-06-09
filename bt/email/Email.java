package email;
 
import java.util.regex.Pattern;
import java.util.Scanner;
 
public class Email{
    public static void getEmail(){
        Scanner input = new Scanner(System.in);
        while(true){
            String EMAIL_PATTERN = 
            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        System.out.println("Nhập vào Email của bạn");
        String email = input.nextLine();
        Pattern.matches(EMAIL_PATTERN, email);
        if(Pattern.matches(EMAIL_PATTERN, email) == true){
            System.out.println(email + "Email nhập đúng");
            break;
        }
        else{
            System.out.println("Mời bạn nhập lại");
        }
        }
        input.close();
    }
    
}
