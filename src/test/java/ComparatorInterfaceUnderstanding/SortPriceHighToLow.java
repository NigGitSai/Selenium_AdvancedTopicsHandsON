package ComparatorInterfaceUnderstanding;

import java.util.Comparator;

public class SortPriceHighToLow implements Comparator<Mobile2> {

	@Override
	public int compare(Mobile2 o1, Mobile2 o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getPrice()-o1.getPrice());
	}
	

}
