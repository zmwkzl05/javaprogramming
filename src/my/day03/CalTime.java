package my.day03;

public class CalTime {

	public static void main(String[] args) {
		final double light_speed = 30e4;
		double distance = 40e12;
		
		double secs;
		
		secs = distance/light_speed;
		
		double light_year = secs/(60.0*60.0*24.0*365.0);
		System.out.println("걸리는 시간은 " + light_year + "광년입니다.");
	}

}


/*
 * Scanner 클래스를 사용한다.
 * '*' 모든걸 포함 하겠다.
 * import 한다.
 * Scanner input<-(이것이 바로 참조형이다.)
 * 참조하려는 클래스 이름, 변수명, new, 생성자 메소드순으로 나온다
 */