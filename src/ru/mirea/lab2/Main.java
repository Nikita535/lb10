package ru.mirea.lab2;

public class Main {

    public static void main(String[] args) {

	    Task1 task=new Task1();
        //два массива с разными типами данных
        String[] str={"asasa", "fgfgf","asawrvdfgd"};
        Integer[] init={1,2,3,4,5};
        //добавление разных типов данных
        task.addElementToList(str);
        task.addElementToList(init);
        task.PrintList();
        //вывод всех файлов в пакете
        task.getFiles();
    }
}
