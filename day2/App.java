public class App {
    public static void main(String[] args) {
      Math math = new Math();
      System.out.println(math.isOdd(4));
      float weight = 52f;
      float height = 1.60f;
      float bmi = ( weight / ( height * height ));
      if( bmi < 18.5 ) {
        System.out.println("Nhẹ Cân " + bmi);
      }
      if(( bmi > 18.5 ) && ( bmi < 24.9 )){
        System.out.println("Bình thường " + bmi);
      }
      if(( bmi > 25.0 ) && ( bmi < 29.9 )){
        System.out.println("Quá cân " + bmi);
      }
      if( bmi > 30.0 ) {
        System.out.println("Quá nguy hiểm " + bmi);
    }
      float diameter = 4.0f;
      System.out.println("Chu vi của hình tròn có đường kính " 
      + diameter + " = " 
      + math.circlePerimeter(diameter));
  
      float x = 3.0f;
      float y = 4.0f;
      float z = 5.0f;
      if (math.isTriangle(x, y, z)) {
        System.out.println("x : " + x + ", y : " + y + ", z : " + z + " tạo thành một tam giác");
      } else {
        System.out.println("x : " + x + ", y : " + y + ", z : " + z + " không tạo thành một tam giác");
      }
      float a = 18.0f;
      float s = 7.0f;
      float d = 9.0f;
      System.out.println("So nho nhat la:"+ math.smallestIn3Numbers( a, s, d));

      int[] numbers={1,3,5,1,7,8,9};
      System.out.println("tong =" + math.sum(numbers));

      System.out.println("TBC=" + math.average(numbers));
      
      int[] numbersreturn = new int[numbers.length];
    for (int i=0; i < numbers.length; i++) {
      numbersreturn[i] = numbers[ numbers.length - 1 - i];
      System.out.println("Đảo ngược" + numbersreturn[i] );
    }

    System.out.println("Tổng số lẻ ="+ math.countOddNumbers(numbers));

    for(int i = 0 ;i <numbers.length ; i++){  
      if(numbers[i] % 2 != 0 ){  
      System.out.println("Các số lẻ là:" +numbers[i]);  
      }  
      }  
  }
}