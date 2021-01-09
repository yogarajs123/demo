import java.util.ArrayList;

public class AbcQsn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A2B3C4";

		String[] alpha = str.split("[0-9]+");// [A, B, C]
		String[] num = str.split("[A-Z]+");// [, 20, 3, 4]

		for (int i = 0; i < alpha.length; i++) {

			for (int j = 0; j < Integer.parseInt(num[i + 1]); j++) {
				System.out.print(alpha[i]);

			}
			
		}
		System.out.println();
		ArrayList<String> list = new ArrayList<>();
		list.add("yoga");
		list.add("raj");
		list.add("yoga");
		
		int indexOf = list.indexOf("yoga");
		int lastIndexOf = list.lastIndexOf("yoga");
		System.out.println(indexOf
				);
		System.out.println(lastIndexOf);
		
		String s="parent1";
		String s2="parent2";
		System.out.println(s.contains(s2.substring(1,4)));
	}

}
