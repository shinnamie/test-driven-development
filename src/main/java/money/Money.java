package money;

public class Money {
	
	protected int amount;
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.getAmount()
				&& getClass().equals(money.getClass());
	}
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
