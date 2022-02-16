public class NumberSystem{

public static int gcf(int a, int b){

  int result = 0;
  if(a < b){
    result = gcf(b,a);
  }else if(b == 0){
    result = a;
  }else{
    int remainder = a % b;
    result = gcf(b, remainder);
  } 

  return result; 
}

public static void reduceFraction(int numerator, int denominator){

  System.out.print(numerator + "/" + denominator);
  int factor;
  factor = gcf(numerator, denominator); // call to gcf
  numerator = numerator / factor;
  denominator = denominator / factor;

  if(denominator > 1){
    System.out.println(" is "+numerator+"/"+denominator);
  }else{
    System.out.println(" is "+numerator);
  }
}
}