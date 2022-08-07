package InversionOfControlWithXmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CoachInterface coach=context.getBean("myCoachVolleyball",CoachInterface.class);
		
		System.out.println(coach.getDailyActivity());
		
		context.close();
	}

}
