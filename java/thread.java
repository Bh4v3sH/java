class thread1 extends Thread{
    public void run(){
        for(int i=0;i<=9;i++)
        System.out.println("this is child thread ");
    }
    
}
class ThreadDemo{
 public static void main(String[] args){
       thread1 t = new thread1();
        t.start();
        for(int i=0;i<=9;i++)
        System.out.println("this is main thread");
    }
}
