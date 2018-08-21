package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService implements IMoodService {
	
	String moodNow;
	Random rand;
	String[] moodList = {"excited","angry","sad","happy","shocked"};
	 /* (non-Javadoc)
	 * @see edu.asu.diging.tutorial.spring.service.IMoodService#getCurrentMood()
	 */
	@Override
	public Mood getCurrentMood() {
	        return new Mood(moodNow);
	 }
	 
	 /* (non-Javadoc)
	 * @see edu.asu.diging.tutorial.spring.service.IMoodService#init()
	 */
	@Override
	@PostConstruct
	 public void init() {
		 rand=new Random();
		 moodNow=moodList[rand.nextInt(moodList.length)];
	 }
}
