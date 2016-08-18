
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		int half = number.length / 2;
		int lastIndex = number.length - 1;
		// number 초기화
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}

		// 정렬
		for (int i = 0; i < half; i++) {
			int tmp = number[i];
			number[i] = number[lastIndex - i];
			number[lastIndex - i] = tmp;
		}

		// 표시
		for (int i = 0; i < number.length; i++) {
			System.out.printf("%d \t", number[i]);
		}
	}
}
