package refactorings.minikatas.money;

/**
 * This is a guided mini-kata : 
 * The goal is to start from a bad situation and bring it to a better state.
 * To do this, some steps are given to upgrade the design.
 * You can follow them or try other ways : 
 * 	There is no perfect solution. it depends on your goal, your (bounded) context,the time or money you have, ...
 * 	As always, compromises are king. 
 * 
 * 
 * 
 * 
 * Lot of stuff is not optimal in the design of products and the code using it shows it quite well.
 * 
 * Product is responsible for many things, the money is modeled directly in the product as a double and a currency 
 * the product is not really encapsulating its state (setters)
 * the service responsible to convertion of currency does a poor job of protecting the products (directly return a converted price)
 * 
 * Your guided tasks (if you choose to follow them) :
 * 	 . Introduce a currency value object and use it in the product
 * 	 . Introduce a price value object to encapsulate the price & currency in the product
 * 	 
 *   . The code and test need the MoneyService to convert money. we will remove this dependency !
 * 	 		. Introduce a PriceConverter (value) Object that the MoneyService will return and do the job of converting price to/from different currency
 * 	 		. Ensure the converter check for correct "from" currency when converting
 *      . then use this object to convert a price to another currency, now you don't need to mock the MoneyService in your test
 * 	 
 * 
 * @author nmahoude
 *
 */
public class EntryPoint {
	static MoneyService service = new MoneyService();
	
	public static void main(String[] args) {

		Product a = new Product("Book", 1, "EUR");
		Product b = new Product("Table", 2.123454485, "BTC");
		
		
		double inYen = service.convert(a.getPrice(), a.getCurrency(), "YEN");
		a.setCurrency("YEN");
		a.setPrice(inYen);
		
		a.roundPrice();
		b.roundPrice();
		printReport(a,b);

		printTotal(a,b);
	}

	private static void printReport(Product... products) {
		for (Product p : products) {
			System.out.println(p.getCurrency()+" "+p.getPrice());
		}
	}
	
	private static void printTotal(Product... products) {
		double total = 0.0;
		for (Product p : products) {
			total += p.getPrice();
		}
		System.out.println("Total is "+total);
	}

}
