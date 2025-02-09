package Java8;

public class ThreadExAnnonymousInnerClass {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<5;i++)
				{
					System.out.println("Anonymous Inner class using interface ex");
				}
			}
			
		});
		
		thread.start();
	}

}
