package money;

public class Franc extends Money{
	
	public Franc(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public String currency() {
		return "CHF";
	}
	
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
