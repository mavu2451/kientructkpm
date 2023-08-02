package decorator;

public class Mainboard extends PCDecorator{

	public Mainboard(MyPC myPC) {
		super(myPC);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String myPC() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String h610() {
		return "H610";
	}
}
