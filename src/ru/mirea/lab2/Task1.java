package ru.mirea.lab2;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;

public class Task1<E> {

    ArrayList<E> list=new ArrayList<E>();

    //функция добавления элементов
    public  void addElementToList(E[] e) {
        for(int i=0;i<Arrays.asList(e).size();i++) {//общий класс массивов.преобразование массивов в список.размер
            list.add(Arrays.asList(e).get(i));
        }
    }

    //функция вывода списка
    public  void PrintList(){
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i).getClass()+"\t"+list.get(i));//getClass для наглядности разных типов
        }
        System.out.println();
    }
    //функция вывода файлов
    public void getFiles(){
        File path=new File(".\\src\\ru\\mirea\\lab2");
        for (int i=0;i<path.listFiles().length;i++) {
            System.out.println(Arrays.asList(path.listFiles()).get(i).getName());
        }
    }

}
