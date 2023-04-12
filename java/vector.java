import java.util.*;
class test{
    public static void main(String[] args){
        Vector list = new Vector();
        
list.add("akash"); //inserting data into list
list.add(100);
list.add(200000);
list.add(98.987);
list.add("manager");
list.insertElementAt("gupta",1);  //insert at specific position
System.out.println(list);
    }
}