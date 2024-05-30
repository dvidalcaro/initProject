package com.initProject.InitProject;

import org.example.App;

public class InitProject {
    public String getGreeting() {
        return "Hello World gradle!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
