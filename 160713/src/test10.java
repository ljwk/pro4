import javax.swing.JOptionPane;

public class test10 {
	enum STATUS {
		search, add
	};

	static STATUS status;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = { "111", "222", "333", "444", "555" };
		String[] name = { "������", "������", "�ż���", "������", "�ӳ���" };
		String[] phoneNumber = { "01011111111", "01022222222", "01033333333", "01044444444", "01055555555" };
		String[] searchPart = new String[number.length];
		String searchText = null, category;
		int index = -1;

		do {
			do {
				category = JOptionPane.showInputDialog("��ȣ�� �˻�(i)\n�̸����� �˻�(n)\n��ȭ��ȣ�� �˻�(p)\n�߰�(a)");
				
				if (category.equals("i") || category.equals("n") || category.equals("p")) {
					status = STATUS.search;
				} else if (category.equals("a"))
					status = STATUS.add;
				else
					JOptionPane.showMessageDialog(null, "�Է¿���(i, n, p, a�� �ʿ���)");
				
			} while (!(category.equals("i") || category.equals("n") || category.equals("p") || category.equals("a")));

			if (status == STATUS.search) {
				switch (category) {
				case "i":
					searchText = JOptionPane.showInputDialog("ȸ����ȣ�� �Է����ּ���");
					searchPart = number;
					break;

				case "n":
					searchText = JOptionPane.showInputDialog("ȸ���̸��� �Է����ּ���");
					searchPart = name;
					break;

				case "p":
					searchText = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է����ּ���");
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
							String select = JOptionPane.showInputDialog(searchText + "(��)�� �˻��� ����� �����ϴ�.\n����(x) �ٽð˻�(c)");
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
				String[] insertData = JOptionPane.showInputDialog("�Է�").split(" ");

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

		System.out.printf("ȸ����ȣ : %s\nȸ���̸� : %s\n��ȭ��ȣ : %s", number[index], name[index], phoneNumber[index]);
	}
}
