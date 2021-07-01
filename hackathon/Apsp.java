public class Apsp {
    public static void main(String[] args) {
        MyMath marth = new MyMath(); 
        float a = 3.0f;
      float b = 4.0f;
      float c = 5.0f;
      if (marth.isTriangLe(a, b, c)) {
        System.out.println("a : " + a + ", b : " + b + ", c : " + c + " tạo thành một tam giác");
      } else {
        System.out.println("a : " + a + ", b : " + b + ", c : " + c + " không tạo thành một tam giác");
      }
    }
}
