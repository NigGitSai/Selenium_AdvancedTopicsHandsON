package Java8;

public interface Browser {

	void browse();
	
	default void mediaPlayer()
	{
		System.out.println("Browse media player");
	}
	
	default void setPrivacySettings()
	{
		System.out.println("Set privacy settings");
	}
}
