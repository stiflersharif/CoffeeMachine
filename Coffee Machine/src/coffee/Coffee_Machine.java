package coffee;

import java.util.Scanner;
/* 
  This is the Driver class of this project
  */
public class Coffee_Machine {
	
    public void ingredients() {
    	System.out.println("Quantity of Coffee "+ new Coffee().getCoffee_qty() );
		System.out.println("Quantity of Milk "+ new Coffee().getMilk_qty());
		System.out.println("Quantity of Sugar "+ new Coffee().getSugar_qty() + "\n");
	 }
    /* Menu card for the Coffee Machine */
    public void menu() {
    	System.out.println("Menu\n"+ "1. Black Coffee: Cost per Cup :- "+ new Black_Coffee().cost());
		System.out.println("2. Cappuccino: Cost per Cup :- "+ new Cappuccino().cost());
		System.out.println("3. Espresso: Cost per Cup :- "+ new Espresso().cost());
		System.out.println("4. Latte: Cost per Cup :- "+ new Latte().cost() + "\n");
		System.out.println("Enter r or R for Ingredients Restocking");
		System.out.println("Enter q or Q for Checkout");
    	
    }

	public static void main(String[] args) {		
		
		Coffee_Machine cm = new Coffee_Machine();
		cm.ingredients();
		cm.menu();
		
		float total_price = 0;
		Scanner sc = new Scanner(System.in);
		
		/*
		  Customer can take coffee irrespective of the no. of cups and upon checkout total bill will be printed
		  */
		while(true) {
			String input = sc.nextLine();
			if(input.equals("1") ) {
				new Black_Coffee().make_coffee();
				float price = new Black_Coffee().cost();
				total_price += price;
			}
			else if(input.equals("2") ) {
				new Cappuccino().make_coffee();
				total_price += new Cappuccino().cost();
			}
			else if(input.equals("3") ) {
				new Espresso().make_coffee();
				total_price += new Espresso().cost();
			}
			else if(input.equals("4") ) {
				new Latte().make_coffee();
				total_price += new Latte().cost();
			}
			else if("r".equalsIgnoreCase(input)) {
				new Coffee().restock();
			}
			else if("q".equalsIgnoreCase(input)) {
				
				System.out.println("Total price to pay: "+ total_price);
				break;
			}
			else {
				System.out.println("Please choose correct option");
			}
			
			
		}

	}

}
