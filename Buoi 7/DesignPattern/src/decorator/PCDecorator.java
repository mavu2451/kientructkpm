package decorator;

public abstract class PCDecorator implements MyPC{
	
	public MyPC mPC;
	
	public PCDecorator(MyPC myPC) {
		this.mPC = myPC;
	}

	public MyPC getMyPC() {
		return mPC;
	}

	public void setMyPC(MyPC mPC) {
		this.mPC = mPC;
	}
	
}
