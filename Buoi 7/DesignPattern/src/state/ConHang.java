package state;

public class ConHang implements IMyPC{

	@Override
	public void trangThai(Context context) {
		context.setMyPC(this);
	}
	public String toString() {
		return "Con Hang";
	}
}
