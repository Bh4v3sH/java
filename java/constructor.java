class test{
    test(){
        System.out.println("default constructor");
    }
    test(int a,int b){
        System.out.println("addition of two numbers = "+(a+b));
    }
public static void main(String[] args){
    test t = new test(20,30);
   test t1 = new test();
}
}
