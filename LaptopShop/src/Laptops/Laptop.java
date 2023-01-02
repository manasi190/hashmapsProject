package Laptops;

public class Laptop {
	private String brandName;
	private String modelName;
	private Integer sellingPrice;
	
	private String os;
	private String processor;
	private Float screenSize;
	private Integer storageCapacity;
	private String storageType;
	
	public Laptop(String bname, String mname, Integer sp, String os, String p, Float scSize, Integer stCap, String stType) {
		setBrandName(bname);
		setModelName(mname);
		setSellingPrice(sp);
		setOs(os);
		setProcessor(p);
		setScreenSize(scSize);
		setStorageCapacity(stCap);
		setStorageType(stType);
	}
	
	
	public Boolean isStorageSSD(Laptop l) {
		
		if((l.storageType).equals("SSD"))		
			return true;
		else 
			return false;
	}
	
	
	public String getStorageType() {
		return storageType;
	}


	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}


	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Float screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Integer getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
}
