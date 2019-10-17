package ecommerce;

	import java.util.List;
	import java.util.Scanner;

	public class Order {

	    Cart cart = new Cart();
	    private int ch = 0;
	    
	    public Order () {
	        menu();
	    }
	    
	    public void startScreen () {
	        System.out.println("1. Show Products");
	        System.out.println("2. Show Cart");
	        
	    }
	    
	    public void storeProductsMenu() {
	        System.out.println("1. Add to Cart");
	        System.out.println("2. Remove From Cart");
	       
	    }
	    
	    public void menu () {
	        do {
	            startScreen();
	            getUserInput();
	            
	            switch (ch) {
	                case 1: 
	                    displayStoreProducts();
	                    storeProductsMenu();
	                    getUserInput();
	                    innerChoice1();
	                    break;
	                case 2:
	                    showCart();
	                    break;
	                case 0:
	                    System.exit(0);
	                    break;
	                default:
	                    
	                    break;
	            }
	        } while (ch != 0);
	    }

	    private void innerChoice1() {
	        switch (ch) {
	            case 1:
	                addProductToCart();
	                showCart();
	                break;
	            case 2:
	                removeProductFromCart();
	                break;
	            default:
	                
	                break;
	        }
	    }

	    private int getUserInput() throws NumberFormatException {
	        Scanner in = new Scanner (System.in);
	        ch = Integer.parseInt(in.nextLine());
	        return ch;
	    }

	    private void displayStoreProducts() {
	        List<Item> products = new Product().getProducts();
	        for (Item prod: products) {
	            System.out.println(
	                    prod.getPid() + "- " +
	                            prod.getName() + " " +
	                            prod.getPrice() 
	                           
	            );
	        }
	    }

	    private void addProductToCart() {
	        int pid = getUserInput();
	        cart.addProductToCartByPID(pid);      
	    }

	    private void showCart() {
	    	
	        System.out.println("Your items are:" );
	        cart.printCartItems();
	        
	    
	    }

	    private void removeProductFromCart() {
	        int pid = getUserInput();
	        
	        cart.removeProductByPID(pid);
	        
	        System.out.println("Your items has been removed");
	    }
	    
	    
	}
	
	

