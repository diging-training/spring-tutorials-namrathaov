package edu.asu.diging.tutorial.spring.domain;

public class Mood {
	private String feeling;
	private String reason; 
    public Mood(String mood) {
        feeling = mood;
        reason=getCurrentFeel(feeling);
    }
 
    public String getFeeling() {
        return feeling;
    }
 
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
    public String getReason() {
    	return reason;
    }
    public String getCurrentFeel(String feeling) {
    	String reason="";
    	switch(feeling) {
    	case "happy":
    		reason="I ate a rat :D ";
    		break;
    	case "sad" :
    		reason="I ate a rat that was not so delicious :(";
    		break;
    	case "shocked":
    		reason="I ate a rat but it was not filling :O ";
    		break;
    	case "angry":
    		reason="I ate a rat and I don't have more >_<";
    		break;
    	case "excited":
    		reason="I ate a rat, I ate a rat!!";
    		break;
    	default: reason="I don't know why!";
    	}
    	return reason;
    }
}