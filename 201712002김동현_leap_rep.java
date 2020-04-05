import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) {		
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		
		year = input.nextInt();
		
		while (year>=1) {
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"년은 윤년입니다");	
		} else			
			System.out.println(year+"년은 평년입니다");
		System.out.print("연도를 입력하세요: ");
		year = input.nextInt();
		
		}
		
		System.out.println("프로그램이 종료되었습니다");
		
	}
}
