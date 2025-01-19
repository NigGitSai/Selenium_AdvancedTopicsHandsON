package Java8;

public class AnonymousAbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnonymousInnerClassParent obj = new AnonymousInnerClassParent() {
			
			
			@Override
			public void findPartner()
			{
				System.out.println("Find partner inside anonymous abstract class");
			}
		};
		
		obj.findPartner();
		
	}

}
