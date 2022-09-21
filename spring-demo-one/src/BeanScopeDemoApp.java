import org.springframework.context.support.ClassPathXmlApplicationContext;

import DependencyInjectionWithConstructorInjection.TrackCoach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file 
		
		ClassPathXmlApplicationContext context=
				    new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container 
		
		// eğer bean scope türü verilmemişse default u singletondır.
		
		TrackCoach theCoach=context.getBean("myCoachForTrack",TrackCoach.class);
		
		TrackCoach alphaCoach= context.getBean("myCoachForTrack",TrackCoach.class);
		
		
        TrackCoach theCoachForProto=context.getBean("myCoachForTrackProtoType",TrackCoach.class);
		
		TrackCoach alphaCoachForProto= context.getBean("myCoachForTrackProtoType",TrackCoach.class);
		//check if they are same 
		
		boolean result=(theCoach==alphaCoach);
		
		//print out the result
		System.out.println("\n Pointing to the same object:  "+result);
		
		System.out.println("\n Memory location for theCoach:  "+theCoach);
		
		System.out.println("\n Memory location for alphaCoach:  "+alphaCoach +"\n");
		
		boolean resultForProto=(theCoachForProto==alphaCoachForProto);
		
        System.out.println("\n Pointing to the same object:  "+resultForProto);
		
		System.out.println("\n Memory location for theCoachForProto:  "+theCoachForProto);
		
		System.out.println("\n Memory location for alphaCoachForProto:  "+alphaCoachForProto +"\n");
		
		context.close();
		
	}

}
