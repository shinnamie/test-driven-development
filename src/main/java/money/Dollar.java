package money;


public class Dollar extends Money{

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
