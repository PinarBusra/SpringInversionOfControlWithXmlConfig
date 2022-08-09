package DependencyInjectionWithConstructorInjection;

public class VolleyballCoach implements CoachInterface {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
    public VolleyballCoach(FortuneService theFortuneService) {
    	fortuneService=theFortuneService;
    }
	
	@Override
	public String getDailyActivity() {
		return "30 dakika kardiyo yap";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
