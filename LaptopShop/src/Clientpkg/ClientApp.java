package Clientpkg;

import java.util.ArrayList;
import java.util.List;

import Laptops.Laptop;
import Laptops.LaptopDB;

public class ClientApp {
	public static void main(String [] args) {
		Laptop l1 = new Laptop("Asus", "ASUS_TUFDX122", 64000, "Windows 11", "AMD RYZEN 5", (float) 18.92, 800, "SSD");
		Laptop l2 = new Laptop("Lenovo", "LNV343zx", 38000, "Windows 10", "i3", (float) 14.5, 500, "HDD");
		Laptop l3 = new Laptop("HP", "HPSDD892", 75000, "Ubuntu 22.0", "i5", (float) 16, 900, "SSD");
		
		LaptopDB ldb = new LaptopDB(l1, l2, l3);
		
		List<Laptop> laptopList = new ArrayList<Laptop> (); 
		
		laptopList = ldb.listAllTypes();
		
		System.out.println(laptopList);
		
		
	}
}
