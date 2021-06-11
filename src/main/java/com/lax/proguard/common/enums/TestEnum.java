package com.lax.proguard.common.enums;

public enum TestEnum {

    NAME1(1,2),
    NAME2(2,4);

    private int name;
    private int value;

    TestEnum(int name, int value){
        this.name=name;
        this.value=value;
    }

    public int getName(){
        return name;
    }

    private int getValue(){
        return value;
    }

}
