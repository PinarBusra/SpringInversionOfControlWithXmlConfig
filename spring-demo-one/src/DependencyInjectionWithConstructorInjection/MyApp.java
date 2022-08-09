package DependencyInjectionWithConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CoachInterface coach=context.getBean("myCoach",CoachInterface.class);
		
		CoachInterface coachTrack=context.getBean("myCoachForTrack",CoachInterface.class);
		System.out.println(coach.getDailyActivity());
		
		// lets call our new method for fortunes
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coachTrack.getDailyActivity());
		
		System.out.println(coachTrack.getDailyFortune());
		
		context.close();
	}

}
