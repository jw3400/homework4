package homework4;

import java.util.Scanner;

public class ExamForWhile {

		
	public static void main(String[] args) {
		
		System.out.println("*************************************");
		System.out.println("                       �ݺ��� �����ϱ�1                             ");
		System.out.println("*************************************");
		System.out.println("    1.  1���� �Է��� ������ ���ϱ� ");
		System.out.println("    2.  �ִ밪/�ּҰ� ���ϱ�");
		System.out.println("    3.  �Է¹��� ������ �հ�� ��� ���ϱ�");
		System.out.println("    4   ���ϴ� ������ ����ϱ�");
		System.out.println("    5.  ¦����/Ȧ���� ����ϱ�");
		System.out.println("    6.  �����ϱ�");
		
		new ExamForWhile().input();

	}
	
	public void input () {
		
		Scanner su = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("���ϴ� �޴���  �����Դϱ�? >>> ");
		int select = su.nextInt();
		count(select);
		su.close(); 
		
	}
	
	 public void count(int select) {

		 		if(select == 1) {
		 			System.out.println("1�� ȣ��");
				    SumOfNumbers cal1 = new SumOfNumbers();
				    cal1.question1();
		 		}
			
		 		else if(select == 2) {
		 			System.out.println("2�� ȣ��");
		 			MaxAndMin cal2 = new MaxAndMin();
		 			cal2.question2();
		 		}
			
		 		else if(select == 3) {
		 			System.out.println("3�� ȣ��");
		 			SumAndAvg cal3 = new SumAndAvg(); 
		 			cal3.question3();
		 		}
			
		 		else if(select == 4) {
		 			System.out.println("4�� ȣ��");
		 			GuGuDan cal4 = new GuGuDan(); 
		 			cal4.question4();
		 		}
			
		 		else if(select ==5) {
		 			System.out.println("5�� ȣ��");
		 			GuGuDan2 cal5 = new GuGuDan2(); 
		 			cal5.question5();
		 		}
			
		 		else if(select ==6) {  
		 			System.out.println("6�� ȣ��-����");
		 			System.exit(0);
		 		}
		 		
		 		else
		 			System.out.println("1~6������ �ش� ��ȣ�� �Է��� �� �ֽ��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
		 			System.exit(select);
	 }
		 	
		 	
}