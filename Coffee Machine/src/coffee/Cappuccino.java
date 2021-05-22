package coffee;

public class Cappuccino extends Coffee {
	
	int coffee_qty=6;
	int sugar_qty=1;
	int milk_qty=2;
			
	public int cost() {
		return super.cost(coffee_qty, sugar_qty, milk_qty);
	}
	
	public void make_coffee() {
		super.make_coffee(coffee_qty, sugar_qty, milk_qty);
		if(this.coffee_qty<super.getCoffee_qty() && this.sugar_qty<super.getSugar_qty() && this.milk_qty<super.getMilk_qty()) {
			update_quantity(coffee_qty, sugar_qty, milk_qty);
		}
		
	}

}
