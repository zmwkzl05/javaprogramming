package my.day03;
import java.util.*;

public class InputString {

	public static void main(String[] args) {
		String name,phoneNumber;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오 : ");
		name=sc.nextLine();
		
		System.out.println("나이를 입력하시오 : ");
		age=sc.nextInt();
		
		System.out.println("전화번호를 입력하시오 : ");
		phoneNumber=sc.next();	// nextLine은 전체 줄을 입력받는것 next 사용시 엔터후에도 입력받을 수 있다
		
		System.out.println(name + "님 안녕하세요! " + age + "살 이시네요. \n연락처는 " + phoneNumber + "입니다.");
	}
// Scanner는 꼭 기억을 하시오!!
// 관계연산자에선 등호가 먼저 나오면 안된다!
}
