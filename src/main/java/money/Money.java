package money;

abstract class Money {
	
	protected int amount;
	abstract Money times(int multiplier);
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.getAmount()
				&& getClass().equals(money.getClass());
	}
	
	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
