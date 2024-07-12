package encapsualtions;
import java.util.Scanner;



class y{
	private int v;
	public void setV() {
		int x;
		System.out.println("User input value : ");
		Scanner o=new Scanner(System.in);
		x=o.nextInt();
		v=10+x;
	}
	public int getV() {
		return v;
		
	}
}
public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		y ob=new y();
		ob.setV();
		System.out.println("User output value : "+ob.getV());
	}

}
