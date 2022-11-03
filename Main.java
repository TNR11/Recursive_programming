package task_8;
/**
 * Assignment task 8: Recursive Programming
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Bag> bags = new LinkedList<>();
		bags.add(new Bag("pink", 7));
		bags.add(new Bag("Black", 10));
		bags.add(new Bag("blue", 5.5));
		
		BagApp bgapp = new BagApp();
		double totalCapacity = bgapp.calcTotalCapacity(bags);
		out.printf("Total capacity: %.2f\n", totalCapacity);
		out.printf("Total number of bags: %d\n", bags.size());
		}
}
	




