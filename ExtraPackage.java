
public abstract class ExtraPackage extends TruePackage {

	private TruePackage myBasePackage;
	
	public ExtraPackage(TruePackage truePackage) {
		myBasePackage = truePackage;
	}
	
	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return myBasePackage.getTotalPrice() + this.getPrice();
	}

}
