package homework4;

import java.util.*;

public class SumAndAvg {
	public void question3() {
	
		System.out.println("### 입력받은 숫자의 합계와 평균 구하기 ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		int sum = 0;
		double avg = 0;
		double avg2 = 0;
		int count = 0;
		
		while(true){
			System.out.print("숫자를 입력(Q:종료) >>> ");
			value = input.nextLine();
			
			if(value.equalsIgnoreCase("Q")) 
			{
				System.out.println("합계는 " + sum + "이고, 평균은 " + avg2 + "입니다.");		
				break;	
			}
			
			if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);	
			sum += num;
			count++;		//입력한 숫자의 수를 계속 count를 해서 누적시킨다. -> 나중에 평균 계산을 하기 위해서 사용	
			avg = sum / count;
			avg2 = Double.parseDouble(String.format("%.2f",avg));		//avg의 값을 소수점 둘째짜리까지 표현하기 위해 사용
			
		}
		input.close();
		
	}
}
