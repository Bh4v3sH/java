import java.util.Scanner;
class test{
public static void main(String[] args){
 int number;
 String str="";
 int decimal = 0;
 int power = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the decimal number");
  number = sc.nextInt();
int n= number;
while(number>0){
int r = number%2;
number = number/2;
str = r+str;
}
System.out.println(str);
int dec = Integer.parseInt(str);
while(dec!=0){
    int r = dec%10;
    decimal = decimal+(int)(r*Math.pow(2,power));
    power++;
    dec = dec/10;
}
System.out.println("decimal numner is "+decimal);
 }
}
