import javax.swing.JOptionPane;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = { "111", "222", "333", "444", "555" };
		String[] name = { "임종욱", "김현민", "신수곤", "최정훈", "임나영" };
		String[] phoneNumber = { "01011111111", "01022222222", "01033333333", "01044444444", "01055555555" };
		String[] searchPart = new String[number.length];
		String searchText = null, category;
		int index = -1;

		do {
			do {
				category = JOptionPane.showInputDialog("번호로 검색(i)\n이름으로 검색(n)\n전화번호로 검색(p)");
				if (!(category.equals("i") || category.equals("n") || category.equals("p")))
					JOptionPane.showMessageDialog(null, "입력오류(i, n, p가 필요함)");
			} while (!(category.equals("i") || category.equals("n") || category.equals("p")));

			switch (category) {
			case "i":
				searchText = JOptionPane.showInputDialog("회원번호를 입력해주세요");
				searchPart = number;
				break;

			case "n":
				searchText = JOptionPane.showInputDialog("회원이름을 입력해주세요");
				searchPart = name;
				break;

			case "p":
				searchText = JOptionPane.showInputDialog("전화번호를 입력해주세요");
				searchPart = phoneNumber;
				break;
			}

			for (int i = 0; i < number.length; i++) {
				if (searchText.equals(searchPart[i])) {
					index = i;
					break;
				}
			}

			if (index == -1)
				JOptionPane.showMessageDialog(null, searchText + "(으)로 검색한 결과가 없습니다.");

		} while (index == -1);

		System.out.printf("회원번호 : %s\n회원이름 : %s\n전화번호 : %s", number[index], name[index], phoneNumber[index]);
	}
}
