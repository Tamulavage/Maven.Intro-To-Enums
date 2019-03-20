package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE("Hey, my name is ALICE!"),
    BOB("Hey, my name is BOB!");

    private String saying;

    public String getCatchPhrase(){
        return this.saying;
    }

    public Boolean isAlice(){
        return this.equals(ALICE);
    }

    public Boolean isBob(){
        return this.equals(BOB);
    }

    AliceBobEnum(String saying){
        this.saying = saying;
    }
}
