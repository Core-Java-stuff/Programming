import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderPizzaService {

	static List<Pizza> orderedPizza = new ArrayList<>();
	// initializing dummy data
	static {
		for (int i = 1; i <= 5; i++) {
			orderedPizza.add(new Pizza("catagory" + i, i, new Random()
					.nextInt(800)));

		}
	}

	public static int findNoOfOrderedPiza() {
		return orderedPizza.size();
	}

	public static int findTotalAmount() {
		return orderedPizza.stream().mapToInt(pizza -> (int) pizza.getAmount())
				.sum();
	}

	public static void main(String[] args) {
		System.out.println("No of pizza Ordered :" + findNoOfOrderedPiza());
		System.out.println("Total Billing Amount :" + findTotalAmount());
	}
}
