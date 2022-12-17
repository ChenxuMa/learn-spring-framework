package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		GamingConsole game=new SuperContraGame();
//		GameRunner runner=new GameRunner(game);
//		runner.run();
		ConfigurableApplicationContext context= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner=context.getBean(GameRunner.class);
		runner.run();

	}

}
