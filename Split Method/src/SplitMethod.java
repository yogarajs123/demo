
public class SplitMethod {

	public static void main(String[] args) 
	{
		//it'll split the string where we want to split
		
		String s="this is my class";
		
		//we have to split wherever the spces are there
		
		String[] ar = s.split(" "); // the split  method will return String type array
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
