import java.util.Scanner;

public class Text3 {

	public static void main(String[] args) {		
		int year;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		
		year = input.nextInt();
		
		while (year>=1) {
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"���� �����Դϴ�");	
		} else			
			System.out.println(year+"���� ����Դϴ�");
		System.out.print("������ �Է��ϼ���: ");
		year = input.nextInt();
		
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�");
		
	}
}
