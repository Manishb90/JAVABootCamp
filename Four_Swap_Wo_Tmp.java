
public class Four_Swap_Wo_Tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 100;
		int sno = 200;
		int tno = 300;
		int frno = 400;

		System.out.println("Before Swapping: ");
		System.out.println("fno:" + " " +fno);
		System.out.println("sno:" + sno);
		System.out.println("tno:" + tno)  ;
		System.out.println("frno:" + frno)  ;
		System.out.println (" ");
		//Swapping  without third variable


		System.out.println("After swapping : "); 
		fno = fno + sno + tno + frno ; 
		sno = fno - sno -tno - frno; 
		tno = fno - sno - tno - frno;
		frno = fno -sno -tno -frno;
		fno = fno - sno - tno - frno ;
		
		System.out.println("fno:" +  fno);
		System.out.println("sno:" + sno);
		System.out.println("tno:" + tno)  ;
		System.out.println("frno:" + frno)  ;

	}

}
