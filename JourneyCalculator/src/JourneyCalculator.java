
public class JourneyCalculator {
	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		 System.out.println(journeyCalculator.calculateDistance(60.0, 1.5));
		 
	}
	public double calculateDistance(double speed, double time) {
		return speed*time;
	}
}
