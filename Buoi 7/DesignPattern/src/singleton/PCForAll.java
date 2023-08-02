package singleton;

public class PCForAll {
	private static PCForAll pcForAll;
	
	private PCForAll() {
	}
	
	public static PCForAll getPCForAll() {
		if(pcForAll == null) {
			pcForAll = new PCForAll();
			System.out.print("I9 13900K + Z690 + RTX 3060 ");
		}
		return pcForAll;
	}
}
