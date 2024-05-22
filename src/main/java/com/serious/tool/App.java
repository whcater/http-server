package com.serious.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.printf("running at %s%n",System.getProperty("user.dir"));
        SpringApplication.run(App.class,args);
    }
}
