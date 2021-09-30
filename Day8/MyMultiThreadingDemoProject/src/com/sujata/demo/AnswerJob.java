package com.sujata.demo;

public class AnswerJob implements Runnable {
	private Chat chat;

	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		String[] answers= {"Hello","I am going good and how about you?","Great!"};
		for(String answer:answers) {
			chat.showAnswer(answer);
			
		}
		
	}
	
	

}
