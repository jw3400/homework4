import java.util.*;

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
		 			System.out.print("1�� ȣ��");
				    SumofNumbers cal1 = new SumofNumbers();
				    cal1.question1();
		 		}
			
		 		else if(select == 2) {
		 			System.out.print("2�� ȣ��");
		 			MaxAndMin cal2 = new MaxAndMin();
		 			cal2.question2();
		 		}
			
		 		else if(select == 3) {
		 			System.out.print("3�� ȣ��");
		 			SumAndAvg cal3 = new SumAndAvg(); 
		 			cal3.question3();
		 		}
			
		 		else if(select == 4) {
		 			System.out.print("4�� ȣ��");
		 			GuGuDan cal4 = new GuGuDan(); 
		 			cal4.question4();
		 		}
			
		 		else if(select ==5) {
		 			System.out.print("5�� ȣ��");
		 			GuGuDan2 cal5 = new GuGuDan2(); 
		 			cal5.question5();
		 		}
			
		 		else if(select ==6) {  
		 			System.out.print("6�� ȣ��-����");
		 			System.exit(0);
		 		}
		 		
		 		else
		 			System.out.println("1~6������ �ش� ��ȣ�� �Է��� �� �ֽ��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
		 			System.exit(select);
	 }
		 	
		 	
}


class SumofNumbers {
	
	public void question1() {

			System.out.println("### 1���� �Է��� ������ ���ϱ� ###");
			Scanner su1 = new Scanner(System.in);
			System.out.print("������ ���� �Է��ϼ���(Q:����) >>> ");
						
			String answer1 = su1.nextLine();
			if(answer1.equals("Q") || answer1.equals("q")) 
				{
					System.out.println("�����մϴ�");
					System.exit(0);
				}
			
			int answer1_1 = Integer.parseInt(answer1);
			cal(answer1_1);
			
			su1.close();
		}

		public int cal(int answer1_1) {
			
			int result1 = 0;
			for(int i=1; i <= answer1_1; i++) 
			{
				result1 += i;
			}
			System.out.println("�� ���� " + result1 + "�Դϴ�.");
			return result1;
		
		}
}

class MaxAndMin {
	
	public void question2() {
		

			System.out.println("### �ִ밪/�ּҰ����ϱ�  ###");
			Scanner input = new Scanner(System.in);

			int size; 
			System.out.print("���Ͻô� �迭�� ũ�⸦ �Է��ϼ��� : ");
			size = input.nextInt();
			if(size < 2) {
				System.out.print("�迭�� ũ��� �ּ� 2�̻��̾�� �մϴ�.");
				System.exit(0);
				}
			int[] answer2 = new int[size];
			
			for(int i=0; i < answer2.length; i++)
			{
					System.out.print("0~100������ ���ڸ� �Է��ϼ���(����:Q) >>> ");						
					answer2[i] = input.nextInt();
					
					if(answer2[i]<0 && answer2[i]>100)
					{
						System.out.println("0~100������ ���ڸ� �Է��ؾ��մϴ�. �ٽ� �Է��Ͻʽÿ�.");
					}

					 if(String.valueOf(answer2[i]).equals("Q") ||String.valueOf( answer2[i]).equals("q")) 
					{
						cal2(answer2);
						break;	
					}
			}		
			input.close();
		
	}
	
		public void cal2(int answer2[]) {
			
			
			int max_num, min_num, tmp;
			for(int i=0; i<answer2.length; i++)
			{
				for(int j=0; j<answer2.length-1; j++)
				{
					if(answer2[j] > answer2[j+1]) {
							tmp = answer2[j];
							answer2[j] = answer2[j+1];
							answer2[j+1] = tmp;
					}
				}
					
			}
			max_num = answer2[answer2.length-1];
			min_num = answer2[0];
			System.out.println("���� ū ���� " + max_num + " �̰�, ���� ���� ���� " + min_num + " �Դϴ�!");
			
			
		}
	
}

class SumAndAvg {
	
	public void question3() {
		
	}
}

class  GuGuDan {
	
	public void question4() {
		
	}
}

class GuGuDan2 {
	
	public void question5() {
		
	}
	
}