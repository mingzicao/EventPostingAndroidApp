package com.laioffer.eventreporter;

/**
 * Created by Prectrum on 12/20/17.
 */

public class Singleton {
    // Step1: Make instance only one
    private static Singleton instance;

    // Step2: Hide constructor
    private Singleton(){

    }

    // Step3: Main function to use singleton
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
