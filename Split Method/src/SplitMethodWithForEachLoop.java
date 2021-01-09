
public class SplitMethodWithForEachLoop {

	public static void main(String[] args) 
	{
		String s="Yogaraj Reddy S";
		
		String[] ar = s.split(" ");//split whereever the space is there
		
		for(String d:ar)
		{
			System.out.println(d);
			
		}

	}

}
