package state;

public class HetHang implements IMyPC{

	@Override
	public void trangThai(Context context) {
		// TODO Auto-generated method stub
		context.setMyPC(this);
	}
	public String toString() {
		return "Het Hang";
	}
}
