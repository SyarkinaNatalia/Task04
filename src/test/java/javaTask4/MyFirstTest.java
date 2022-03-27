package javaTask4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyFirstTest extends BaceTest {


    @Parameters({"id", "name", "age"})
    @Test
    public void firstTest(int id, String name, int age) {
        System.out.println("Id " + id);
        System.out.println("Имя " + name);
        System.out.println("Возраст " + age);
    }

    @Parameters({"name"})
    @Test
    public void secondTest(String name){
        if (name.equals(name.toUpperCase())){
            System.out.println("Имя должно начинаться с большой буквы");
        } else {
            System.out.println("Имя введено верно");
        }
    }

    @Parameters({"age"})
    @Test
    public void thirdTest(int age){
        if (age > 20){
            System.out.println("Возраст не может быть больше 20 лет");
        } else {
            System.out.println("Возраст указан верно");
        }
    }

    @Parameters({"name"})
    @Test
    public void fourthTest(String name){
        if (name.matches("[\\W\\d]")){
            System.out.println("Имя содержит недопустимые символы");
        } else {
            System.out.println("Имя введено верно");
        }
    }

}
