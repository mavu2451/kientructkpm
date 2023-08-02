package decorator;

public class VGA extends PCDecorator{

	public VGA(MyPC myPC) {
		super(myPC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String myPC() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String rtx3060() {
		return "RTX 3060";
	}
	public String rtx2060() {
		return "RTX 2060";
	}
}
