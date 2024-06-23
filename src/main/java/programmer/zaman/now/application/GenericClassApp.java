package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class GenericClassApp {

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Fadel");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
