public class Math {
  public boolean isOdd(int x) {
    return x % 2 != 0;
  }

  public boolean isEven(int x) {
    return x % 2 == 0;
  }

  public float calculateBMI(float height, float weight) {
    return weight / (height * height);
  }

  public float circlePerimeter(float diameter) {
    return diameter * 3.14f;  
  }

  public boolean isTriangle(float x, float y, float z) {
    return ((x + y > z) && (y + z > x) && (x + z > y));
  }

  public float smallestIn3Numbers(float a, float s, float d) {
    if (( a < s ) && ( a < d )){
      return a;
    }
    if (( s < a )&&( s < d )){
      return s;
    }
    else{
      return d;
    }
  }
  
  public float sum(int[] numbers) {
  float tong=0;
  for ( int i = 0; i< numbers.length; tong = tong + numbers[i++]);
  return tong;
  }

  public float average(int[] numbers) {
    float tbc;
    float tong=0;
    for ( int i = 0; i< numbers.length; tong = tong + numbers[i++]);
    tbc= tong/(numbers.length) ;
    return tbc;
  }

  public int[] reverseArray(int[] numbers) {

    return null;
  }
  public int countOddNumbers(int[] numbers) {
    int oddCount = 0;
    for(int i = 0; i < numbers.length; i++)
    {
      if(numbers[i] % 2 == 1)
        oddCount++;        
    }
    return oddCount;
  }
  public int OddNumbersarray(int[] numbers){

    return 0;
  }

}