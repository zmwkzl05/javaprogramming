package my.day04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=0, i=0;
		Random random = new Random();
		int computer=random.nextInt(100);
		
		 do{
			Scanner sc = new Scanner(System.in);
			System.out.println("정답을 추측하여 보시오: ");
			int guess=sc.nextInt();
			
			if(guess<computer) {
				System.out.println("LOW");
			}
			else if(guess>computer) {
				System.out.println("HIGH");
			}
			i++;
			answer=guess;
		}while(answer != computer);
		System.out.println("축하합니다. 시도횟수 = "+i);
	}

}
