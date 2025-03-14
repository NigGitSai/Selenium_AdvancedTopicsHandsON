package Java8;

public class LamdaExpExThree {
	
	public void usingClassicalWay()
	{
		IExampleThreeFuncInterface iExampleThreeFuncInterface = new ClassCImpExampleThree();
		
		//iExampleThreeFuncInterface.ansIterrogateQues("I dont");
		
		System.out.println("using classical way : "+iExampleThreeFuncInterface.ansIterrogateQues("I dont"));
		
	}
	
	public void usingAnonymousInnerClass()
	{
		IExampleThreeFuncInterface iExampleThreeFuncInterface = new ClassCImpExampleThree() {
			
			@Override
			public String ansIterrogateQues(String ans) {
				// TODO Auto-generated method stub
				return "Do you excercise weekly ? "+ans;
			}
		};
		
		//iExampleThreeFuncInterface.ansIterrogateQues("I do");
		System.out.println("using anonymous inner class : "+iExampleThreeFuncInterface.ansIterrogateQues("I do"));
		
	}
	public void usingLamdaExpression() {  
		IExampleThreeFuncInterface iExampleThreeFuncInterface = (ans)->{return  "Do you excercise weekly ? "+ans; };
		iExampleThreeFuncInterface.ansIterrogateQues("I do");
		System.out.println("using lamda expression : "+iExampleThreeFuncInterface.ansIterrogateQues("I do"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaExpExThree lamdaExpExThree = new LamdaExpExThree();
		
		lamdaExpExThree.usingClassicalWay();
		
		lamdaExpExThree.usingAnonymousInnerClass();
		
		lamdaExpExThree.usingLamdaExpression();
	}

}
