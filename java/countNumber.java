import java.util.*;
class test{
    void display(){
  Scanner sc = new Scanner(System.in);
    System.out.println("enter the String");
String str = sc.nextLine();
System.out.println(str.length());
    }
  public static void main(String[] args){
    test t = new test();
    t.display();
  }
}