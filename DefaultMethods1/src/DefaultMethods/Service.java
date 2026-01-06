package DefaultMethods;

public interface Service {

	default void RunLogin() {
		System.out.println("Runnning service");
	}
	
	
	
}
