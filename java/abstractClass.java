abstract class test{
 abstract void add();  //abstract method
}
class serviceProvier extends test{
  void add(){  // accessing abstract method
    System.out.println("this is abstract method");
  } 
}
class demo{
    public static void main(String[] args){
    serviceProvier s = new serviceProvier();
        s.add();
    }
}