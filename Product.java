package ecommerce;

	import java.util.ArrayList;
	import java.util.List;

	public class Product {
	    private final List<Item> products = new ArrayList<Item>();

	    public Product () {
	        this.initStoreItems();
	    }
	    
	    public List<Item> getProducts() {
	        return products;
	    }
	    
	    public void initStoreItems() {
	        String [] productNames = {"Tshirts", "Bike", "Sports Kit"};
	        Double [] productPrice = {400.00d, 60000.00d, 3000.00d};
	        Integer [] stock = {10, 6, 10};
	        
	        
	        for (int i=0; i < productNames.length; i++) {
	            this.products.add(new Item(i+1, productNames[i], productPrice[i], stock[i]));
	        }
	    }
	}

