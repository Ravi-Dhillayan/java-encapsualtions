package encapsualtions;

import java.util.Scanner;


class AA{
	private String  value;
	public void setValue()
	{
		System.out.println("Enter the Name of User : ");
		Scanner o=new Scanner(System.in);
		String x=o.nextLine();
		String p[] = x.split("\\s+");
		value=p[0]+" kumar";
	}
public String  getValue() {
	return value;
}
}
public class BB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ob=new AA();
		ob.setValue();
		System.out.println(" name of user : "+ "" + ob.getValue());
	}

}
