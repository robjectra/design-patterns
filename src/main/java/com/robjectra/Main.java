package com.robjectra;

import com.robjectra.singleton.SingletonClass;
import com.robjectra.singleton.SingletonEnum;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException {
//        Singleton.run();
         Factory.run();

    }
}