package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * ���������� �ʵ�տ� �����ϴ� data type�� (����������type) �� �ȿ� ����ִ� �������� ��� ��������� �����ϸ� �ȴ�.
 * �׷��� ������, �� ���������� �ʵ忡 . �� ������ ��뼳������ ���õ� ��ɸ� ����� �� �ִ�.
 * java�� ��� ��ü�� �������� ���� �� �ִ�.
 * �������� type�� ��������� �ǹ��̴�.
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main�޼ҵ尡 ���۵˴ϴ�.");

		// ������ Ȯ��!
		HandPhone p1 = new HandPhone();
		// � ��ü�� �������� �θ�type���� ���� �� �ִ�.
		Phone p2 = new HandPhone();
		Object p3 = new HandPhone();

	}
}