package DependencyInjectionWithConstructorInjection;

public class TrackCoach implements CoachInterface {
    
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	
	
	@Override
	public String getDailyActivity() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}

}
