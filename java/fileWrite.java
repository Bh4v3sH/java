import java.io.*;
class FileWrite{
    public static void main(String[] args){
        try{
    FileWriter f = new FileWriter("abc");
    try{ 
        f.write("ahmad ali khan");
    }
    finally{
        f.close();
    }
    System.out.println("data written successfully");
        } catch(IOException i){
        System.out.println(i);
    }
}
}