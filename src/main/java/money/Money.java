package money;

public class Money implements Expression{
	
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier,currency);
	}
	
	Expression plus(Money addend) {
		return new Sum(this,addend);
	}
	
	String currency() {
		return currency;
	}
	
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.getAmount()
				&& currency().equals(money.currency());
	}
	
	static Money dollar(int amount) {
		return new Money(amount,"USD");
	}
	
	static Money franc(int amount) {
		return new Money(amount,"CHF");
	}
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}
	
	
	

}
