package my.day04;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		
		Scanner input = new Scanner(System.in);
		System.out.println("월의 이름을 입력하시오: ");
		month=input.next();
		
		switch(month) {
		case "january":
			System.out.println("1월");
			break;
		case "february":
			System.out.println("2월");
			break;
		case "march":
			System.out.println("3월");
			break;
		case "april":
			System.out.println("4월");
			break;
		case "may":
			System.out.println("5월");
			break;
		case "june":
			System.out.println("6월");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}

}
