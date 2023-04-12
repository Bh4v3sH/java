import java.util.*;
class test{
    
     public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str1 = "";
System.out.println("enter the string");
String str = sc.next();
char[] ch = str.toCharArray();
for(int i=ch.length-1; i>=0; i--){
    str1 = str1 + ch[i];
}
System.out.println(str1);
    }
}