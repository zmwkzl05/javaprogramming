package my.day04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	final int SCISSOR=0;
	final int ROCK=1;
	final int PAPER=2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수값 만드는거
		// math에서 random은 0.0<=random<1.0까지 가능
		// math에서 1,2,3... 나오게 하려면 강제 형변환 하구 *n값하여 미만 값 바꾸기
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2): ");
		int user=sc.nextInt();
		
		int computer=random.nextInt(3);
		if(user==computer)
			System.out.println("인간과 컴퓨터가 비겼음");
		else if((user==0)&&(computer==2)||(user==1)&&(computer==0)||(user==2)&&(computer==1))
			System.out.println("인간: "+user+"컴퓨터: "+computer+"      인간 승리");
		else if((user==0)&&(computer==1)||(user==1)&&(computer==2)||(user==2)&&(computer==0))
			System.out.println("인간: "+user+"컴퓨터: "+computer+"    컴퓨터 승리");
		else
			System.out.println("잘못된 입력입니다.");

	}
}