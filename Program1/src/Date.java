class Date{
	int day;
	int date;
	int year;
}
Date(){
	day = 23;
   month = 12;
   year = 1999;
}
Date(int month, int day ,int yaer){
	this.month month;
	this.day day;
	this.yaer year;
}
void displaytest(){
	System.out.print("Day=" day+ "/" +date+ "/"+year"/")
}
class Datetest{
	public static void main(String [] args){
		//Date d = new Date();
		Date d = new Date(2,4,99);
		System.out.println(d.day+"/"+d.month+"/"+d.year);

	}
}
