package com.sbc.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ���C���N���X
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "!!!Spring start!!!" );
    }
}
