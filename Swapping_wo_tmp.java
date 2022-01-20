
public class Swapping_wo_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fno = 100;
int sno = 200;
int tno = 300;

System.out.println("Before Swapping: ");
System.out.println("fno:" + " " +fno);
System.out.println("sno:" + sno);
System.out.println("tno:" + tno)  ;
System.out.println (" ");
//Swapping  without third variable


System.out.println("After swapping : "); 
fno = fno + sno + tno ; 
sno = fno - sno -tno; 
tno = fno - sno - tno; 
fno = fno - sno - tno ; 
System.out.println("fno:" +  fno);
System.out.println("sno:" + sno);
System.out.println("tno:" + tno)  ;



	}

}
