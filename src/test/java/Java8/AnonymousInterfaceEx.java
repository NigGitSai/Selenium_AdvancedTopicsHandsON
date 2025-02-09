package Java8;

public class AnonymousInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	IParent parent = new IParent() {

		@Override
		public void findPartner() {
			// TODO Auto-generated method stub
			System.out.println("test anonymous inner class");
		}
		
	};
	parent.findPartner();
	
	}

}
