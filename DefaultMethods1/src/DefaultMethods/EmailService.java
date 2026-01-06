package DefaultMethods;

public class EmailService implements Service{
	
	
	public void sendEmail() {
		EmailService s = new EmailService();
		s.RunLogin();
		System.out.println("Sending email");
	}

	public EmailService() {
	}
	
}
