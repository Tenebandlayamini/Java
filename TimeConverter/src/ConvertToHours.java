import java.util.Scanner;

public class ConvertToHours {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int minutes=scan.nextInt();
		System.out.println(convertToHours(minutes));
		scan.close();
		}
	
		public static double convertToHours(int minutes) {
			return minutes/60.0;
		}
	}


