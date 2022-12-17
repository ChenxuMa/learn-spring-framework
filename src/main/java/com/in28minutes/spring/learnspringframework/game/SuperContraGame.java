package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{
    public void up(){
        System.out.println("SuperContra jump");
    }
    public void down(){
        System.out.println("SuperContra down");
    }
    public void right(){
        System.out.println("SuperContra accelerate");
    }
    public void left(){
        System.out.println("SuperContra stop");
    }
}
