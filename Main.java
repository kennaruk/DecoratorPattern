
public class Main {
	public static void main(String[] args) {
		TrueMove trueMovePackage = new TrueMove();
		ExtraPackage highSpeedPackage = new HighSpeedInternet(trueMovePackage);
		ExtraPackage trueVision = new TrueVision(highSpeedPackage);
		
		System.out.println("Total price: " + trueVision.getTotalPrice());
	}
}
