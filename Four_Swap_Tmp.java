
public class Four_Swap_Tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno =100;
		int sno = 200;
		int tno = 300;
		int frno = 400;

		System.out.println("Before Swapping: ");
		System.out.println("fno:" + fno);
		System.out.println("sno:" + sno);
		System.out.println("tno:" + tno);
		System.out.println("frno:" + frno);
		System.out.println(" ");


		//swapping 

		int tmp = 0;
		tmp = fno;
		fno= sno;
		sno= tno;
		tno = frno;
		frno = tmp; 

		System.out.println("After  Swapping: ");
		System.out.println("fno:" + fno);
		System.out.println("sno:" + sno);
		System.out.println("tno:" + tno);
		System.out.println("frno:" + frno);
		
		
	}

}
