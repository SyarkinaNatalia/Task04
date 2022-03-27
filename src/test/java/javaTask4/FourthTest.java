package javaTask4;

import javaSimple.ForConsrtructo;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FourthTest extends BaceTest {

    @Test
    public void startTest1(){
        System.out.println("Первый тест");
        String curDir = System.getProperty("user.dir"); //корень каталога, где лежит проект
        System.out.println(System.getProperty("os.name"));
        String filePath;

        if(System.getProperty("os.name").contains("Windows")){
            filePath = curDir + "\\src\\main\\resources\\test";
        }else {
            filePath = curDir + "./src/main/resources/test";
        }

        String line = null;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            line = bf.readLine();       //одна строка
            BufferedReader bf2 = new BufferedReader(new FileReader(filePath));
            bf2.lines().forEach(s -> System.out.println("строка файла " + s));      // все строки
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(line);

        Assertion a = new Assertion();
        a.assertTrue(line.contains("теста"), "Проверяем, что текст содержит");


    }

    @Parameters({"Проба теста", "Вторая проба теста"})
    @Test
    public  void  startTest2(@Optional String firstParam, @Optional String secondParam){
        ForConsrtructo con = new ForConsrtructo();
        System.out.println("Новый тест с параметром " + firstParam);
        System.out.println("И второй параметр " + secondParam);
        System.out.println("Но на самом деле " + con.constParam1 + " " + con.constParam2);

    }
}
