package ru.hse.lab1.second;

/**
 * @author Федотов Герман Сергеевич
 * @version 1.0
 * @since 2026
 */

public class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= '" + name + '\'' +
                ", age=" + age +
                '}';
    }
}