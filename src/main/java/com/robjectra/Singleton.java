package com.robjectra;

import com.robjectra.singleton.SingletonClass;
import com.robjectra.singleton.SingletonEnum;

import java.io.*;
import java.lang.reflect.Constructor;

public class Singleton {
    public static void run() throws IOException, ClassNotFoundException, NoSuchMethodException {
        // 1) get single thread object
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
        Runnable runnable = ()->{
            System.out.println(SingletonClass.getInstance());
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);
        Thread t6 = new Thread(runnable);
        Thread t7 = new Thread(runnable);
        Thread t8 = new Thread(runnable);

        // 2) get instance using multiple threads
//        t1.start();t2.start();
//        t3.start();t4.start();
//        t5.start();t6.start();
//        t7.start();t8.start();

        // 3) using clone
//        Singleton cloneObj = singleton.clone();
//        System.out.println(cloneObj);
//        System.out.println(cloneObj.getInstance());

        // 4) using serialization
        final String fileName = "singleton.txt";
        // write object
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectOutputStream objOut = null;
        try {
            objOut = new ObjectOutputStream(fileOut);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            objOut.writeObject(singletonClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("serialized data save in singleton.txt");

        // read object
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream objIn = new ObjectInputStream(fileIn);
        SingletonClass serObject = (SingletonClass) objIn.readObject();
//        System.out.println(serObject);
//        System.out.println(serObject.getInstance());

        // 5) using reflection API
        Constructor<SingletonClass> construct = SingletonClass.class.getDeclaredConstructor();
        construct.setAccessible(true);
//        SingletonClass newSingletonInst = construct.newInstance();
//        System.out.println(newSingletonInst);

        // Enum
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum.getValue());
    }
}
