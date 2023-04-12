class A{
public void marry(){
    System.out.println("You have to marry with indumati");
}
}
class B extends A{
public void marry(){
    System.out.println("No papa ! I want to marry with Rashmika Mandanna");
}
}
class Demo{
    public static void main(String[] args){
        B b = new B();
       b.marry();
    }
}