import java.util.Scanner;
public class B04 {

	void input() {

		Scanner su = new Scanner(System.in);
		System.out.print("������ �������� �Է��ϼ���. : ");

		 double money = su.nextInt();

		double total = cal(money);
		System.out.println("���� �ݾ׿� ���� �ҵ漼�� " + total + "�� �Դϴ�.");
		su.close();
	}

	double cal(double money) {

		double total = 0;
		if(money > 0 && money < 10000000) {

		total = Math.round(money * 0.095);
		
		}
		else if(money >= 10000000 && money < 40000000) {

		total = Math.round(money * 0.19);

		}
		
		else if(money >= 40000000 && money < 80000000) {

		total = Math.round(money * 0.28);

		}

		else if(money >= 80000000) {

		total = Math.round(money * 0.37);

		}

		return total;

	}

	public static void main(String[] args) {
		new B04().input();

	}
	
	
}