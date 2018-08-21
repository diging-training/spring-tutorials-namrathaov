package edu.asu.diging.tutorial.spring.service;

import javax.annotation.PostConstruct;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface IMoodService {

	Mood getCurrentMood();

	void init();


}