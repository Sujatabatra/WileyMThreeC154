package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Juggler implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware ,InitializingBean,DisposableBean{

	private int balls;
	private String beanName;

	public Juggler() {
		System.out.println("1. Juggler Constructor");
	}

	public void setBalls(int balls) {
		System.out.println("2. Setter methods of Juggler");
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println(beanName + " Juggler is juggling " + balls + " balls!");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. Setting the Bean Name to : " + name);
		this.beanName = name;

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. Setting up Bean Factory if any of " + beanName);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. Setting up Application Context if any of " + beanName);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. Common Init Method for all Jugglers and this is for "+beanName);
		
	}
	
	public void customInitForBean1() {
		System.out.println("8. Custom Init method 1 for "+beanName);
	}
	
	public void customInitForBean2() {
		System.out.println("8. Custom Init method 2 for "+beanName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Distruction 1: destroy for "+beanName);
		
	}
	
	public void customDestroyForBean1() {
		System.out.println("Distruction 2 : custom destroy method 1 for "+beanName);
	}
	
	public void customDestroyForBean2() {
		System.out.println("Distruction 2 : custom destroy method 2 for "+beanName);
	}

}
