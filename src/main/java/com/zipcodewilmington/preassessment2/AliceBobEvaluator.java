package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String stringToEval=null;

    public AliceBobEvaluator(String string){
        this.stringToEval = string;
    }

    public boolean isAlice(){
        return stringToEval.equals("Alice");
    }

    public boolean isBob(){
        return stringToEval.equals("Bob");
    }

}
