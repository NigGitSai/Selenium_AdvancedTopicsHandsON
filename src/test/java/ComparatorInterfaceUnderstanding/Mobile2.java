package ComparatorInterfaceUnderstanding;



public class Mobile2 {
	 private int memory;
	    private double megaPixel;
	    private double price;
	    private String brand;
	    private ModelName modelName;
	    private String color;

	    public Mobile2(int memory, double megaPixel, double price, String brand, ModelName modelName, String color) {
	       super();
	    	this.memory = memory;
	        this.megaPixel = megaPixel;
	        this.price = price;
	        this.brand = brand;
	        this.modelName = modelName;
	        this.color = color;
	    }

	    public int getMemory() {
	        return memory;
	    }

	    public double getMegaPixel() {
	        return megaPixel;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public ModelName getModelName() {
	        return modelName;
	    }

	    public String getColor() {
	        return color;
	    }
}

	enum ModelName {
	    GALAXY_S21, 
	    IPHONE_13, 
	    PIXEL_6, 
	    ONEPLUS_9, 
	    XIAOMI_MI11, 
	    NOKIA_XR20, 
	    SONY_XPERIA_1, 
	    ASUS_ROG_PHONE_5, 
	    REALME_GT, 
	    MOTOROLA_EDGE;
	}


