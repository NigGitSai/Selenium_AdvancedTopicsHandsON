package DefaultMethodAndMultipleInheritance;

public class Son implements IFather, IMother {

	public void eat()
	{
		System.out.println("Eating Watermelon");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			IFather son = new Son();
			IMother son1 = new Son();
			Son son2 = new Son();
			
			son.eat();
			son1.eat();
			son2.eat();
	}

}
