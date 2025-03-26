package ComparatorInterfaceUnderstanding;

import java.util.Comparator;

public class SortLowToHighSolvingIntegerOverflow implements Comparator<Mobile2>  {

	@Override
	public int compare(Mobile2 o1, Mobile2 o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
