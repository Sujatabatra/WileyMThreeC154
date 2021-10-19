package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Employee;
import com.sujata.producer.Performer;
/*
 * when the scope of the bean is singleton then only we can control the lazy or eager loading of the bean
 * incase of prototype by default bean is at lazy loading and even if we make lazy-init = false still it will be at lazy loading only
 */
public class Performances {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
//		Performer performer1=(Performer)springContainer.getBean("Vishnu");
//		performer1.perform();
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml"); //Life cycle of Shivendra executed
		springContainer.registerShutdownHook();
		System.out.println("*****************************");
//		Performer performer1=(Performer)springContainer.getBean("Vishnu"); //Life cycle of Vishnu executed here as scope=prototype or vishu is also on lazy loading
//		
//		Performer performer2=(Performer)springContainer.getBean("Vishnu");  //does the life cycle will again execute? Yes : By default spring beans are singleton and for vishnu scope is prototype
		
//		System.out.println("Vishnu : performer1 : "+performer1);
//		System.out.println("Vishnu : performer2 : "+performer2);
		
//		Performer performer3=(Performer)springContainer.getBean("Waqar"); //Life cycle of waqar executed : because for Waqar Lazy-init:true
//		Performer performer4=(Performer)springContainer.getBean("Waqar"); //does the life cycle will again execute? NO : Bydefault spring beans are singleton
//		System.out.println("Waqar : performer3 : "+performer3);
//		System.out.println("Waqar : performer4 : "+performer4);
		
//		performer1.perform();
		System.out.println("========================");
		
		Employee emp1=(Employee)springContainer.getBean("salaried");
		emp1.showEmployee();
		
		

	}

}
