package programmer.zaman.now.application;

import programmer.zaman.now.util.ArrayHelper;

public class ArrayApp {
    public static void main(String[] args) {
        String[] names = {"Udin", "Fadel", "Abdan", "Fajar"};
        Integer[] ages = {20, 30, 25, 22, 223};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.<Integer>count(ages));
    }
}
