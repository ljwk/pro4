import javax.swing.JOptionPane;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] number = { "111", "222", "333", "444", "555" };
		String[] name = { "������", "������", "�ż���", "������", "�ӳ���" };
		String[] phoneNumber = { "01011111111", "01022222222", "01033333333", "01044444444", "01055555555" };
		String[] searchPart = new String[number.length];
		String searchText = null, category;
		int index = -1;

		do {
			category = JOptionPane.showInputDialog("��ȣ�� �˻�(i)\n�̸����� �˻�(n)\n��ȭ��ȣ�� �˻�(p)");
			if (!(category.equals("i") || category.equals("n") || category.equals("p")))
				JOptionPane.showMessageDialog(null, "�Է¿���(i, n, p�� �ʿ���)");
		} while (category.equals("i") || category.equals("n") || category.equals("p") ? false : true);

		do {
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
			default:

			}

			for (int i = 0; i < number.length; i++) {
				if (searchText.equals(searchPart[i])) {
					index = i;
					break;
				}
			}
			
			if (index == -1)
				JOptionPane.showMessageDialog(null, searchText + "(��)�� �˻��� ����� �����ϴ�.");
		} while (index == -1 ? true : false);

		System.out.printf("ȸ����ȣ : %s\nȸ���̸� : %s\n��ȭ��ȣ : %s", number[index], name[index], phoneNumber[index]);
	}
}
