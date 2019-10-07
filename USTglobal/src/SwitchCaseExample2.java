public class SwitchCaseExample2 {

   public static void main(String args[]){
      char ch='z';
      switch(ch)
      {
      default:
   	   System.out.println("Default ");
   	   
	 case 'd':
	   System.out.println("Case1 ");
	   break;
	 case 'b':
	   System.out.println("Case2 ");
	   break;
	 case 'x':
	   System.out.println("Case3 ");
	   break;
	 case 'y':
           System.out.println("Case4 ");
           break;
	
      }
   }
}