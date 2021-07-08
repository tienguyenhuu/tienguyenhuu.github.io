/**
 * Pairing
 */
public class Pairing {

    public static void main(String[] args){
        String a ="Thụy Sĩ,Tây Ban Nha,Bỉ,Italy,phap,my";
    String[] b = a.split( "," );
    for(int i = 0; i < b.length; i++){
        for(int j =i+ 1; j <b.length; j++){
            if(b[i] != b[j]){
                System.out.println("[" +b[i] + "--" + b[j] + "]");
            }
        }
    }
    }
}