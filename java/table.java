import java.util.Scanner;
class test{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int t = input.nextInt();
    for(int i = 1; i <=10; i++){
        System.out.println(t*i);
    }
}
}