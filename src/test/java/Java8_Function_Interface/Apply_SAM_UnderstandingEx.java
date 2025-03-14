package Java8_Function_Interface;

import java.util.function.Function;

public class Apply_SAM_UnderstandingEx {
	
	
	public void usingLamdaExp()
	{
		Function<Integer,Double> usdToInr =  (amount)->amount*85.8;
		
		System.out.println("Understand apply single abstract method using lambda expression : "+ usdToInr.apply(10));
	}
	
	public void usingAnonymousInnerClass()
	{
		Function<Integer,Double> functionRef = new Function<Integer,Double>(){

			@Override
			public Double apply(Integer inr) {
				// TODO Auto-generated method stub
				return inr*85.8;
			}
			
		};
		
		System.out.println(" Understand apply single abstract method using anonymous inner class : "+functionRef.apply(10));
			
	}
	public static void main(String[] args) {
		Apply_SAM_UnderstandingEx aplApplySAMUnderstandingEx = new Apply_SAM_UnderstandingEx();
		
		aplApplySAMUnderstandingEx.usingLamdaExp();
		
		aplApplySAMUnderstandingEx.usingAnonymousInnerClass();
	}

}
