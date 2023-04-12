package refactorings.minikatas.money;

public class MoneyService {

	public double convert(double price, String currency, String toCurrency) {
		if ("EUR".equals(currency)  && "YEN".equals(toCurrency)) {
			return price * 100;
		} else {
			return price;
		}
	}

}
