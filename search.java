import java.util.*;

class search{
	
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int [] a = new int[10];
	  int item;
	  System.out.print("Enter the elements of the array");
	    for(int i=0;i<a.length;i++){
	    	a[i]=sc.nextInt();
	    }
	    System.out.print("Enter the item to search");
	    item = sc.nextInt();
	    int loc =search(a,item);
	    if(loc==-1)
	    	System.out.print("Items not in list");
	    else
	    	System.out.print("Item at location" + loc);
	}

}
static int search(int []a , int item){

	int i;
	for(i=0;i<length;i++){
		if item==a[i])
return=i;
{
	return -1;
	}
}

