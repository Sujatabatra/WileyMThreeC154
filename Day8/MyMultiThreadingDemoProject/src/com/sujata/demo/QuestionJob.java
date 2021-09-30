package com.sujata.demo;

public class QuestionJob implements Runnable {

	private Chat chat;
	
	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		String[] questions= {"Hi","How are you","I am good too"};
		for(String question:questions) {
			chat.showQuestion(question);
		}

	}

}
