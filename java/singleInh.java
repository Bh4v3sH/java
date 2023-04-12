class A{
public void mgs(){
  System.out.println("this is base class");
}
}
class B extends A{
public void mgs1(){
    
     System.out.println("derived");
}
}
class Demo{
    public static void main(String[] args){
        B b = new B();
     b.mgs();
     b.mgs1();
    }
}