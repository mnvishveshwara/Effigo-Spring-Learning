package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;

import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game= new PacmanGame();
		return game;
	}

	
}
