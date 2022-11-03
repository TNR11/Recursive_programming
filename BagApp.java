package task_8;

import java.util.List;

public class BagApp {
	public double calcTotalCapacity(List<Bag> bagList)  {
		 if (bagList == null || bagList.size() == 0) return 0;
		double capacity = bagList.get(0).getCapacity();
		List<Bag> sub = bagList.subList(1,  bagList.size());
		return capacity + calcTotalCapacity(sub);//method conditionally calls itself. Recursive progarmming.
	 }
}
