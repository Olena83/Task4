package ListString;

import java.util.ArrayList;
import java.util.List;

public class ListString1 {public static void main(String[] args) {
//    List<String> names = new ArrayList<>();
//    names.add("Olena");
//    names.add("Olga");
//    names.add("Makar");
//    names.add("Orest");
//    names.add("Dmutro");
//    List<String> names1 = new ArrayList<>();
//    names.add("Iruna");
//    names.add("Oleg");
//    names.add("Andrij");
//    names.add("Oleg");
//    names.add("Nadiya");
//    names.add("Taras");
//    names.addAll(names1);
//    System.out.println(names);

    List<Integer> a = new ArrayList<>();

    for (int i = 0; i <=100; i++)
    { a.add(i); }
    System.out.println(a);
    List<Integer> a1 = new ArrayList<>();
    for (int i = 1; i <a.size(); i++){int b=a.get(i) ;if (b%2==0){a1.add(i);}
        }System.out.println(a1);

    List<Integer> a2 = new ArrayList<>();
    for (int i = 1; i < a.size(); i++){int s=a.get(i);if (s%3==0){a2.add(i);}}
    System.out.println(a2);
    for (int number:a2){
        System.out.println(number);}
    System.out.println(a2.size());

//