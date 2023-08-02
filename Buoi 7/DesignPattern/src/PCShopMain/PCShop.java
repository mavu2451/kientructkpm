package PCShopMain;

import decorator.ChipXuLy;
import decorator.Mainboard;
import decorator.MyPC;
import decorator.ThongTinPC;
import decorator.VGA;
import singleton.PCForAll;
import state.ConHang;
import state.Context;
import state.HetHang;

public class PCShop {
	public static void main(String[] args) {
//State design pattern
		Context context = new Context();
		ConHang con = new ConHang();
		HetHang het = new HetHang();
		con.trangThai(context);	
//Singleton design pattern
		PCForAll pc = PCForAll.getPCForAll();
		System.out.println(context.getMyPC().toString());	
		
//Decorator design pattern
		MyPC m1 = new ThongTinPC();
		ChipXuLy chip = new ChipXuLy(m1);
		VGA vga = new VGA(m1);
		Mainboard mb = new Mainboard(m1);
		System.out.println(m1.myPC() + "\n" + chip.i3());
		System.out.println(vga.rtx3060());
		System.out.println(mb.h610());
		
		het.trangThai(context);
		System.out.println(context.getMyPC().toString());	

		
		
	}
	
}
