package prob03;

import java.util.Objects;

public class Money {
	private int amount;

	public Money(int amount){
		this.amount = amount;
	}

	public Money add(Money money){
		return new Money(this.amount + money.amount);
	}

	public Money minus(Money money){
		return new Money(this.amount - money.amount);
	}

	public Money multiply(Money money){
		return new Money(this.amount * money.amount);
	}

	public Money devide(Money money){
		return new Money(this.amount / money.amount);
	}

	@Override
	public boolean equals(Object o) {
		if((o instanceof Money money) && this.amount == money.amount){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

}
