class CheckArgumentException extends Exception{
      int c;
      CheckArgumentException(int c){
      this.c =c;
      }

      public String toString(){

      	return("\nException: Arguments present "+ c + ", Required 5");
      }

}

  class commandLine{

	public static void main(String[] args){
     try{
     if(args.length!=5){
     	throw new CheckArgumentException(args.length);
     }
     int i[] =new int[5];
     int sum=0;
     for(int k=0;k<args.length;k++){
       i[k]=Integer.parseInt(args[k]);
       sum=sum+i[k];
            }
            System.out.print("\nSum of the numbers= "+sum);
        }
        catch(CheckArgumentException e){
        	System.out.print(e);
        }
	}
}