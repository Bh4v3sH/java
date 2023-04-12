class Circle{
 double PI = 3.14; 
public void area(int r){  
double area = PI*r*r;
    System.out.println("area of circle is "+area); 
}
public void perimeter(int r){
    double p = 2*PI*r;
    System.out.println("perimeter of circle is "+p);
}
public static void main(String[] args){
    Circle c = new Circle();
    c.area(2);
    c.perimeter(3);

}
}