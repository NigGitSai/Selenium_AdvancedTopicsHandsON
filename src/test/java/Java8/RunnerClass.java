package Java8;

public class RunnerClass {
	
	public static void main(String[] args) {
		AnonymousInnerClassParent obj1 = new AnonymousInnerClassParent() {
			
			public void findPartner()
			{
				System.out.println("Find partner myself inside anonymous inner class");
			}
		};
		
		obj1.educate();
		obj1.findPartner();
		
		
		AnonymousInnerClassParent obj2 = new AnonymousInnerClassParent();
		obj2.findPartner();
	}
	
	
	
	
	
}
