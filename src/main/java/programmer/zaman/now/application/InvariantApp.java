package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Fadel");
//        doIt(stringMyData);
//        MyData<Object> objectMyData = new stringMyData;

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // ERROR
        // doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData){
        // do nothing
    }}
