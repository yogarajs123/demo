
public class Ex2 {

	public static void main(String[] args)
	{
		String d="Apple";
		StringBuffer sb = new StringBuffer(d);
		sb.setCharAt(0,sb.charAt(sb.length()-2));
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

}
