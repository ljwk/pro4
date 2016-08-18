
public class ArrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] num = { 1, 2, 3, 4, 5 };
		// int[] num2 = num;
		//
		// num[0] = 50;
		// System.out.println(num2[0]);

		int[] num = { 1, 2, 3, 4, 5 };
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		
		num[0] = 50;
		System.out.println(num2[0]);
	}
}
