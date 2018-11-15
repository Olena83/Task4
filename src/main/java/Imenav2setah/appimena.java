package Imenav2setah;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class appimena {
    public static void main (String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Oleg");
        names.add("Taras");
        names.add("Olga");
        names.add("Vitali");
        names.add("Maruna");
        names.add("Viktor");
        names.add("Oksana");
        names.add("Kateruna");
        names.add("Bogdan");
        names.add("Iruna");

        Set<String> names1 = new HashSet<>();
        names1.add("Oleg");
        names1.add("Alina");
        names1.add("Georgij");
        names1.add("Veronika");
        names1.add("Maruna");
        names1.add("Viktor");
        names1.add("Pavlo");
        names1.add("Kateruna");
        names1.add("Bolodumur");
        names1.add("Iruna");

        names.retainAll(names1);
        System.out.println(names); }
}
