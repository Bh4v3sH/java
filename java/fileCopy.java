import java.io.*;
class copyFile{
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("GTR.txt");
        FileOutputStream w = new FileOutputStream("CopyGTR.txt");
        int i;
        while((i=r.read())!=-1){
            w.write((char)i);
        }
        System.out.println("data copied success fully");
    }
}