package com.robjectra.signleton;

import java.io.Serializable;

public enum SingletonEnum implements Cloneable, Serializable {
    INSTANCE;

    private int value = 0;

    public int getValue() {
        return value;
    }

    public boolean setValue(int value) {
        this.value = value;
        return false;
    }
}
