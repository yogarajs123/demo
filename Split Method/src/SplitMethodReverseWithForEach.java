
public class SplitMethodReverseWithForEach {

	public static void main(String[] args) 
	{
		String s="Yogaraj Reddy S";
		String[] ar = s.split(" ");
		for(String d:ar)
		{
			StringBuffer sb = new StringBuffer(d);
			sb.reverse();
			System.out.println(sb);
		}
		// TODO Auto-generated method stub

	}

}
