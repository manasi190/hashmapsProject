package Laptops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaptopDB {
	private Map<String, Laptop> map;
	
	public LaptopDB(Laptop l1, Laptop l2, Laptop l3) {
		map = new HashMap<String, Laptop>();
		map.put(l1.getBrandName(), l1);
		map.put(l2.getBrandName(), l2);
		map.put(l3.getBrandName(), l3);
	}

	public Map<String, Laptop> getMap() {
		return map;
	}

	public void setMap(Map<String, Laptop> map) {
		this.map = map;
	}

	
	//METHODS:
	//1:
	public List<Laptop> listAllTypes() {
		List<Laptop> laptopList = new ArrayList<Laptop> (); 
		
		for(Map.Entry<String, Laptop> entry : map.entrySet())
		{
			laptopList.add(entry.getValue());
			
		}
		
		return laptopList;
	}
	
	//2.
	public List<Laptop> listByBrandName(String brandName){
		List<Laptop> laptopList = new ArrayList<Laptop> (); 
		
		for(Map.Entry<String, Laptop> entry : map.entrySet())
		{
			if((entry.getValue().getBrandName()).equals(brandName)) {
				laptopList.add(entry.getValue());
			}

		}
		
		return laptopList;
	}
	
	//3.
	public List<Laptop> listBySellingPrice(Boolean val, Integer sellingPrice){
		List<Laptop> laptopList = new ArrayList<Laptop> (); 
		
		
		for(Map.Entry<String, Laptop> entry : map.entrySet()) {
			if(val == true) {
				if((entry.getValue().getSellingPrice()) < sellingPrice) {
					laptopList.add(entry.getValue());
				}
			}else {
				if((entry.getValue().getSellingPrice()) >= sellingPrice) {
					laptopList.add(entry.getValue());
				}
			}
		}
		
		return laptopList;
	}
	
	//4.
	public List<Laptop> filterByScreenSize(Float screenSize){
		List<Laptop> laptopList = new ArrayList<Laptop> (); 
		
		for(Map.Entry<String, Laptop> entry : map.entrySet()) {
			if((entry.getValue().getScreenSize()) == screenSize) {
				laptopList.add(entry.getValue());
			}
		}
		
		return laptopList;
	}
	
	//5.
	public List<Laptop> filterByMinStorageCapacity(String stCap){
		List<Laptop> laptopList = new ArrayList<Laptop> ();
		
		for(Map.Entry<String, Laptop> entry : map.entrySet()) {
			if((entry.getValue().getStorageCapacity()).equals(stCap)) {
				laptopList.add(entry.getValue());
			}
		}
		
		return laptopList;
	}
	
	//6.
	public List<Laptop> filterByOs(String os){
		List<Laptop> laptopList = new ArrayList<Laptop> ();
		
		for(Map.Entry<String, Laptop> entry : map.entrySet()) {
			if((entry.getValue().getOs()).equals(os)) {
				laptopList.add(entry.getValue());
			}
		}
		
		return laptopList;
	}
	
	//7.
	public List<Laptop> filterByStorageSSD(Boolean isStorageSSD){
		List<Laptop> laptopList = new ArrayList<Laptop> ();
		
		for(Map.Entry<String, Laptop> entry : map.entrySet()) {
			if((entry.getValue().isStorageSSD(entry.getValue()).equals(isStorageSSD))) {
				laptopList.add(entry.getValue());
			}
		}
		
		return laptopList;
	}
}
