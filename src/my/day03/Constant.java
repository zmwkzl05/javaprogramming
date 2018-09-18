package my.day03;

public class Constant {

	public static void main(String[] args) {
		final double KM_PER_MILE = 1.609344; // 기호상수는 대문자로
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile;
		
		System.out.println("60마일은 "+ km + "킬로미터입니다.");
	}
// 클래스 이름 앞에 final이 붙으면 상속할 수 없어요~
}
