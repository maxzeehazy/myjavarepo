package com.javaonlinecourse.b3lesson3.Mywork;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by EvilCorp on 26.11.2016.
 */
public class Test{
    public static void main(String[] args) throws IOException {


        Map<String, Cat> map = new HashMap<>();
        map.put("Барсик", new Cat("Барсик"));
        map.put("Вася", new Cat("Барсик"));
        map.put("Жорик", new Cat("Барсик"));
        map.put("Гарфилд", new Cat("Барсик"));
        map.put("Кузя", new Cat("Барсик"));
        map.put("Лиза", new Cat("Барсик"));
        map.put("Герман", new Cat("Барсик"));
        map.put("Рыжик", new Cat("Барсик"));

        for (Map.Entry<String, Cat> catty: map.entrySet()) {
            System.out.println(catty);
        }

    }

}
class Cat {
    String name;
    Cat(String name){
        this.name = name;
    }
}