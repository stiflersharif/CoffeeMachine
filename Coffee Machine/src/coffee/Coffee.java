package coffee;

public class Coffee {
	private static int coffee_qty=10;
	private static int sugar_qty=5;
	private static int milk_qty=10;

	private final int coffee_unit_cost=4;
	private final int sugar_unit_cost=1;
	private final int milk_unit_cost=2;
	
	public int cost(int coffee_qty, int sugar_qty, int milk_qty)
	{	
	  return coffee_unit_cost*coffee_qty + sugar_unit_cost*sugar_qty + milk_unit_cost*milk_qty;
	}
	
	public void update_quantity(int coffee_qty,int sugar_qty, int milk_qty) {
		this.setCoffee_qty(this.getCoffee_qty() - coffee_qty);
		this.setSugar_qty(this.getSugar_qty() - sugar_qty);
		this.setMilk_qty(this.getMilk_qty() - milk_qty);
		//System.out.println(this.getCoffee_qty());
	}
	
	public void make_coffee(int coffee_qty,int sugar_qty, int milk_qty) {
		if(this.getCoffee_qty() > coffee_qty && this.getSugar_qty() > sugar_qty && this.getMilk_qty() > milk_qty ) {
			System.out.println("Dispensing");
		}		
		else {
			System.out.println("drink is out of stock");
		}
	}
	
	public void restock() {
		this.setCoffee_qty(10);
		this.setSugar_qty(5);
		this.setMilk_qty(10);	
		System.out.println("Restocking complete");
	}

	public int getCoffee_qty() {
		return coffee_qty;
	}

	public void setCoffee_qty(int coffee_qty) {
		this.coffee_qty = coffee_qty;
	}

	public int getSugar_qty() {
		return sugar_qty;
	}

	public void setSugar_qty(int sugar_qty) {
		this.sugar_qty = sugar_qty;
	}

	public int getMilk_qty() {
		return milk_qty;
	}

	public void setMilk_qty(int milk_qty) {
		this.milk_qty = milk_qty;
	}
	
	

}
