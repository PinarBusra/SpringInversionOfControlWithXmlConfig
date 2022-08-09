package DependencyInjectionWithSetterInjection;

public class CricketCoach implements CoachInterface {
   
	
	
	private FortuneService fortuneService;
	
	

	//create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//create a setter method for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyActivity() {
		return "Practice fast bowling for 15 minutes.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
