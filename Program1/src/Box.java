class Box{
double width;
double height;
double depth;

      Box(){
   width=5;
   height=6;
   depth=7;
}
  Box(double width, double height, double depth){
  	this.width=width;
  	this.height=height;
  	this.depth=depth;
  }
double voulume(){
	return(width*height*depth);
   }
}
class BoxDemo{
	pubic staic void main(String [] args){
		Box b=new Box();
		Box b1 = new Box(6,6,6,);
		System.out.print("Volume of Box with non-parameterized")
		System.out.print("\nVolume of Box with parameterized c")
	}
}
