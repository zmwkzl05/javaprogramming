package my.day03;
import java.util.*;

public class Temp {

	public static void main(String[] args) {
		double f,c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("화씨온도를 입력하시오 : ");
		f=input.nextDouble();
		c = 5.0 / 9.0 * (f - 32.0);
		
		System.out.println("섭씨온도는 " + c);
	}

}
