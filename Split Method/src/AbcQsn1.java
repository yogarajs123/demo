import java.util.Arrays;

public class AbcQsn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		int output = 0;
		int ar[] = new int[input];

		ar[0] = input;
		for (int i = 1; i < input; i++) {
			ar[i] = (ar[i - 1] * 10) + input;

		}
		System.out.println(Arrays.toString(ar));

		for (int i = 0; i < ar.length; i++) {
			output += ar[i];
		}

		System.out.println(output);

	}

}
