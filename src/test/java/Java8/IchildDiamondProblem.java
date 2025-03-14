package Java8;

public class IchildDiamondProblem  implements IFather,IMother {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		IFather.super.eat();
	}
	
	public static void main(String[] args) {
		IFather son = new IchildDiamondProblem();
		IMother son1 = new IchildDiamondProblem();
		IchildDiamondProblem son2 = new IchildDiamondProblem();
		
		son.eat();
		son1.eat();
		son2.eat();
	}

}
