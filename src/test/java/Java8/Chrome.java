package Java8;

public class Chrome implements Browser {

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("In chrome browser");
	}
	
	public static void main(String[] args) {
		Browser chrome = new Chrome();
		chrome.browse();
		chrome.mediaPlayer();
	}

}
