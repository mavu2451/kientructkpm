package state;

public class Context {
	private IMyPC myPC;
	public Context() {
		myPC = null;
	}
	public IMyPC getMyPC() {
		return myPC;
	}
	public void setMyPC(IMyPC myPC) {
		this.myPC = myPC;
	}
	
}
