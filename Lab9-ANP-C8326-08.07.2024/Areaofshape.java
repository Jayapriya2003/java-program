interface Shape{
void getArea();
}
class Rectangle implements Shape{
public void getArea(){
int length=5;
int breadth=10;
System.out.println("The area of the Rectangle is: " +(length*breadth));
}
}
class Circle implements Shape{
public void getArea(){
int radius;
double pi=3.14,area;
radius=5;
area=pi*radius*radius;
System.out.println("The area of the Circle is: " +area);
}
}
class Triangle implements Shape{
public void getArea(){
int height=10;
int base=5,area;
area=height*base/2;
System.out.println("The area of the Triangle is: " +area);
}
}
class Areaofshape{
public static void main(String args[]){
Rectangle r=new Rectangle();
r.getArea();
Circle c=new Circle();
c.getArea();
Triangle t=new Triangle();
t.getArea();
} 
}