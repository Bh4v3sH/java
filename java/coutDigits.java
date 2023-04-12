import java.util.*;
class test{
 public int convert(String str){
    int r,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the String");
    str = sc.next();
int num = Integer.parseInt(str);
while(num>0){
    r = num%10;
    sum = sum+r;
    num = num/10;
}
return sum;
 }
 public static void main(String[] args){
    test t = new test();
    int result;
    String str1="";
result = t.convert(str1);
System.out.println(result);
 }
}