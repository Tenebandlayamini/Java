import java.util.Scanner;

public class classPlanetExplorerApp {

	public static void main(String[] args) {
		PlanetExplorer explorer = new PlanetExplorer();
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
		scan.close();
	}

}
