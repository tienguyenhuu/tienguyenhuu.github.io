package bt;

import java.util.Scanner;

public class BMI {
    public void getWeightHeight()
     {
      Scanner input = new Scanner(System.in);   
        while (true) 
        {
          System.out.println("Nhập vào Cân nặng của bạn");
          float weight;
          weight = input.nextFloat();
          System.out.println("Nhập vào triều cao của bạn");
          float height;
          height = input.nextFloat();
          System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
          String name = input.nextLine();
          name = input.nextLine();
          if (name.equals("q")) {
            break;
          } 
          float BMI;
          BMI = weight / (height * height);
          if ( BMI <18.5) {
            System.out.println("Tên:" + name + "-Chỉ số BMI:" + BMI + "-Bạn quá nhẹ cân");
            continue;
          }
          if(( BMI > 18.5 ) && ( BMI < 24.9 )){
            System.out.println("Tên:" + name + "-Chỉ số BMI:" + BMI + "-Bình thường");
            continue;
          }
          if(( BMI > 25.0 ) && ( BMI < 29.9 )){
            System.out.println("Tên:" + name + "-Chỉ số BMI:" + BMI + "-Thừa cân");
            continue;
          }
          if( BMI > 30.0 ) {
            System.out.println("Tên:" + name + "-Chỉ số BMI:" + BMI + "-Nguy hiểm");
        }
          if( BMI == 0 ){
            break;
          }
        }
        input.close(); 
      }
    }