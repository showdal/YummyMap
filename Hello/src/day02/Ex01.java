package day02;

public class Ex01 {
	public static void main(String[] args) {
		
		// 1. �غ��� 5�̰� ���̰� 3�� �ﰢ���� ���̸� ���ؼ� ����ϼ���.
		double width = 5;
		double height = 3;
		double soo = 0.5;
		double area1 = width * height * soo;
		
		
		// 2. ���ΰ�5, ���ΰ� 7�� �簢���� ���̸� ���ؼ� ����ϼ���.
		// ���� ����� �ʱ�ȭ
		int garo = 5;
		int sero = 7;
		int area2 = garo * sero;
		
		
		// 3. �������� 2�� ���� �ѷ��� ���ؼ� ����ϼ���.
		// ���� ����� �ʱ�ȭ
		int rad = 2;
		double pi = 3.14;
		double around = 2 * rad * pi;
		
		
		//���� ������ �����ʹ� ������ ����� ������ �����ؼ� ����ϼ���.
	
		
		System.out.println("1. �غ��� " + width + "�̰� ���̰� " + height + "�� �ﰢ���� ������ " + area1 + "�Դϴ�.");
		System.out.println("2. ���ΰ� " + garo + "�̰� ���ΰ� " + sero + "�� �簢���� ���̴� " + area2 + "�Դϴ�.");
		System.out.println("3. �������� " + rad + "�� ���� �ѷ��� " + sero + "�� ���� �ѷ��� " + around + "�Դϴ�.");
	}
}