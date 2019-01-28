class box extends rectangle
{
	private double height;

	public box(){
		super();
		height=-1;
	}
	public box(double l, double w, double h )
	{
		super(1,w);
		height=h;
	}
	public void setdimension(double l,double w,double h)
	{
		super.setDim(l,w);
		height=h;
	}
	public double getheight()
	{
	return height;
}
public double area()
{
	return 2*(getlength()*getwidth()+getlength()*height+getwidth()*height);
}
public double volume()
{
	return getlength()*getwidth()*height;
}
public void print()
{
	System.out.print(" \n box :area =" +area()+ "volume = "+volume());
}
}
