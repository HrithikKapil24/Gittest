import java.util.*;

class Shape{

public void displayMsg(){

	System.out.print("\nThis is a Shape");

}

}

class Circle extends Shape{
int radius;

Circle(int radius){
this.radius=radius;
}

double area(){
	return 3.14*r*r;
}

void dispayArea(){
	System.out.print("\nArea of the circle =" + Area);
}
}
class Rectangle extends Shape{
int length,breadth;
Rectangle(int length,int breadth){
	this.length=length;
	this.breadth=breadth;
	}
double area(){
	return length*breadth;
}
class ShapeInheritanceDemo{
	public static void main(String[] args){
	Circle c = new Circle(4);
	System.out.print("\nCircle calling its function and inherited");
	c.displayArea();
	c.displayMsg();

Rectangle r = new Rectangle(2,3);
System.out.print("\nRectangle calling its function and inherited function"
r.displayArea();
r.displayMsg();
}



