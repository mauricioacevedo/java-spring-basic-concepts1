package com.test.springdemo;

public class BaseballCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.test.springdemo.Coach#getDailyWorkout()
	 */
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fs) {
		// TODO Auto-generated constructor stub
		fortuneService = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
