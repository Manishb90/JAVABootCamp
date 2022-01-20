//With temp Variables
public class Swaping_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fno =100;
int sno = 200;
int tno = 300;

System.out.println("Before Swapping: ");
System.out.println("fno:" + fno);
System.out.println("sno:" + sno);
System.out.println("tno:" + tno);


//swapping 

int tmp = 0;
tmp = fno;
fno= sno;
sno= tno;
tno = tmp; 

System.out.println("After  Swapping: ");
System.out.println("fno:" + fno);
System.out.println("sno:" + sno);
System.out.println("tno:" + tno);




	}

}
