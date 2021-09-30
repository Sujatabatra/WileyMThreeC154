package com.sujata.demo;

public class ChatMain {

	public static void main(String[] args) {
		Chat chat=new Chat();
		QuestionJob questionJob=new QuestionJob(chat);
		AnswerJob answerJob=new AnswerJob(chat);
		
		Thread bhanu=new Thread(questionJob, "Bhanu");
		Thread waqar=new Thread(answerJob,"Waqar");
		
		bhanu.start();
		waqar.start();

	}

}
