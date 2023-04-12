
import java.util.Scanner;
class test{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enetr 1st binary number");
     String b1 = sc.next();
 System.out.println("enetr 1st binary number");
     String b2 = sc.next();
     int b3 = Integer.parseInt(b1,2);
      int b4 = Integer.parseInt(b2,2);
      int n = b3+b4;
      System.out.println("addition of binary number is "+Integer.toBinaryString(n));
    }
}