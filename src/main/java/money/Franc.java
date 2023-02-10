package money;

public class Franc extends Money{

	
	public Franc(int amount,String currency) {
		super(amount,currency);

	}

	public Money times(int multiplier) {
		return new Money(amount * multiplier,currency);
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
