package money;

public class Dollar extends Money {

	public Dollar(int amount,String currency) {
		super(amount,currency);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
