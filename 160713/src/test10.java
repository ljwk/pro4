import javax.swing.JOptionPane;

public class test10 {
	enum STATUS {
		search, add
	};

	static STATUS status;

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
				category = JOptionPane.showInputDialog("번호로 검색(i)\n이름으로 검색(n)\n전화번호로 검색(p)\n추가(a)");
				
				if (category.equals("i") || category.equals("n") || category.equals("p")) {
					status = STATUS.search;
				} else if (category.equals("a"))
					status = STATUS.add;
				else
					JOptionPane.showMessageDialog(null, "입력오류(i, n, p, a가 필요함)");
				
			} while (!(category.equals("i") || category.equals("n") || category.equals("p") || category.equals("a")));

			if (status == STATUS.search) {
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
				
				if (searchText != null) {
					for (int i = 0; i < number.length; i++) {
						if (searchText.equals(searchPart[i])) {
							index = i;
							break;
						}
					}

					do {
						if (index == -1) {
							String select = JOptionPane.showInputDialog(searchText + "(으)로 검색한 결과가 없습니다.\n종료(x) 다시검색(c)");
							if (select.equals("x"))
								System.exit(0);
							else if (select.equals("c"))
								break;
						} else
							break;
					} while (true);
				}
			}
			
			if (status == STATUS.add) {
				String[] insertData = JOptionPane.showInputDialog("입력").split(" ");

				String[] numbertmp = new String[number.length + 1];
				System.arraycopy(number, 0, numbertmp, 0, number.length);
				number = numbertmp;
				number[number.length - 1] = insertData[0];

				String[] nametmp = new String[name.length + 1];
				System.arraycopy(name, 0, nametmp, 0, name.length);
				name = nametmp;
				name[name.length - 1] = insertData[1];

				String[] phoneNumbertmp = new String[phoneNumber.length + 1];
				System.arraycopy(phoneNumber, 0, phoneNumbertmp, 0, phoneNumber.length);
				phoneNumber = phoneNumbertmp;
				phoneNumber[phoneNumber.length - 1] = insertData[2];
			}
		} while (index == -1);

		System.out.printf("회원번호 : %s\n회원이름 : %s\n전화번호 : %s", number[index], name[index], phoneNumber[index]);
	}
}
