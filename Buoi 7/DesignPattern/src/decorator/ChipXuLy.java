package decorator;

public class ChipXuLy extends PCDecorator {

	
	
	public ChipXuLy(MyPC myPC) {
		super(myPC);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String myPC() {
		// TODO Auto-generated method stub
		String chip = mPC.myPC();
		return chip + i3();
	}
	public String i3() {
		return "I3 13100F";
	}
	public String i5() {
		return "I5 13100F";
	}
	public String i7() {
		return "I7 13100K";
	}

}
