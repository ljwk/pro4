import javax.swing.JOptionPane;

public class test9 {

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
				category = JOptionPane.showInputDialog("��ȣ�� �˻�(i)\n�̸����� �˻�(n)\n��ȭ��ȣ�� �˻�(p)");
				if (!(category.equals("i") || category.equals("n") || category.equals("p")))
					JOptionPane.showMessageDialog(null, "�Է¿���(i, n, p�� �ʿ���)");
			} while (!(category.equals("i") || category.equals("n") || category.equals("p")));

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
		} while (index == -1);

		System.out.printf("ȸ����ȣ : %s\nȸ���̸� : %s\n��ȭ��ȣ : %s", number[index], name[index], phoneNumber[index]);
	}
}
