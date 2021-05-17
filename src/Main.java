import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		System.out.println("BJ - JPTable");
		while(true) {
			System.out.println("\n1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choice >> ");
			menu = scan.nextInt();
			if(menu == 1) {
				int num1 = 0, num2 = 0;
				while(num1 < 1 || num1 > 100) {
					System.out.print("Input the first number [1- 100](inclusive) : ");
					num1 = scan.nextInt();
				}
				while(num2 < 1 || num2 > 100) {
					System.out.print("Input the second number [1- 100](inclusive) : ");
					num2 = scan.nextInt();
				}
				scan.nextLine();
				boolean boolNum = num1 == num2; 
				System.out.printf("+ (String type)\t\t(Character Type)\t* (Integer type)\t/ (Floating Type)\tinput 1 == inpu 2 (Boolean Type)\n");
				System.out.printf("%d + %d\t\t\t%c\t%c\t\t%d\t\t\t%.3f\t\t\t%b\n", num1, num2, num1, num2, num1*num2, (float) num1 / (float) num2, boolNum);
//				System.out.println(" + (String type)	(Character Type)	* (Integer type)	/ (Floating Type)	input 1 == inpu 2 (Boolean Type)");
//				System.out.println(num1 + " " + num2 + "			" + (char) num1 + " " + (char) num2 + "			" + num1*num2 + "			" + (float) num1 / (float) num2 + "		" + boolNum);
				System.out.println("Press enter to proceed..");
				scan.nextLine();
				System.out.println("Data Type : Integer");
				System.out.print("+\t-\t*\t/\t%\n");
//				System.out.println("+");
				System.out.printf("%d\t%d\t%d\t%d\t%d\n" ,num1 + num2, num1 - num2, num1 * num2, num1 / num2, num1 % num2);
				System.out.println("Press enter to proceed..");
				scan.nextLine();
				boolean bool1, bool2;
				String temp;
				while(true) {
					System.out.print("Give me value for p1 [true | false] : ");
					temp = scan.nextLine();
					if(temp.equalsIgnoreCase("True")) {
						bool1 = true;
						break;
					} else if(temp.equalsIgnoreCase("False")) {
						bool1 = false;
						break;
					}
				}
				while(true) {
					System.out.print("Give me value for p2 [true | false] : ");
					temp = scan.nextLine();
					if(temp.equalsIgnoreCase("True")) {
						bool2 = true;
						break;
					} else if(temp.equalsIgnoreCase("False")) {
						bool2 = false;
						break;
					}
				}
				char p1, p2;
				if(bool1) p1 = 'T';
				else p1 = 'F';
				if(bool2) p2 = 'T';
				else p2 = 'F';
				System.out.println("Logical Table");
				System.out.printf("P1 = %c , P2 = %c\n", p1, p2);
				System.out.printf("!P1\t!P2\t&&\t||\n");
				System.out.printf("%b\t%b\t%b\t%b\n" , !bool1, !bool2, bool1 && bool2, bool1 || bool2);
			} else if(menu == 2) {
				System.out.println("Thank You for using the apps!!");
				break;
			}
		}
		scan.close();
	}

}
