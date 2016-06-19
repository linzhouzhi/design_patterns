package com.mycompany.app.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lzz on 6/19/16.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    void brew() {
        System.out.println( "dripping coffee through filter ");
    }

    void addCondiments() {
        System.out.println( "adding sugar and milk" );
    }

    @Override
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y") ? true : false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println( "would you like milk and sugar with your coffee (y/n)?" );
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in) );
        try{
            answer = in.readLine();
        } catch ( IOException e ){
            System.err.println("IO error trying to read your answer");
        }
        if( answer == null ) {
            return "no";
        }
        return answer;
    }
}
