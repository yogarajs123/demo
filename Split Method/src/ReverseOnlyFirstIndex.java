
public class ReverseOnlyFirstIndex {

	public static void main(String[] args) 
	{
		String s="Yogarj Reddy S";
		
		String[] ar = s.split(" ");
		
		StringBuffer sb = new StringBuffer(ar[0]);
		sb.reverse();
		ar[0]=""+sb; //cant concate Stirng and StringBuffer so make SB as String by adding empty string
		
		for(String d:ar)
		{
			System.out.println(d);
		}
		
		



	}

}
