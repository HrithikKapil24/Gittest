public class Circle{
	double radius;
	double findArea(){
		return radius*radius*3.14159;
	}
void displayArea(){
	System.out.print("Area =" + findArea());
}
Circle()
{
	radisu=6;
}
class Circledemo{
	public static void main(String[] args)
	{Circle C = new Circle();
		//c.radius=5;
		C.radius =5;
		C.displayArea();
	}
}