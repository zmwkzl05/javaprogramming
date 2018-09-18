package my.day03;
/*
 * 사용자로부터 데이터 입력하는 예제
 * Scanner 클래스 사용
 */
import java.util.*;	// Scanner 클래스 포함 => 클래스보다는 먼저 패키지보다는 나중에 나와야한다.
public class Add2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		// print는 커서가 문장 바로 뒤에 있는것
		int num1 = input.nextInt();
		
		System.out.println("두번째 정수를 입력하세요 : ");
		// println은 커서가 다음 문장 시작에 있는것
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println(sum);
	}

}
