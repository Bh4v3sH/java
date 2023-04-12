class Join extends Thread{
    public void run(){
        try{
       for(int i=0;i<5;i++){
            System.out.println("ahmad ali");
            Thread.sleep(1000);
        }
        }catch(InterruptedException i){
}
       }}
class Demo{
    public static void main(String[] args)throws InterruptedException{
        Join t = new Join();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("rohit");
            Thread.sleep(1000);
        }
    }
}
