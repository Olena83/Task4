package Set;

import java.time.Instant;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class app3 {public static void main (String[] args) {
//    Set<String> names= new HashSet<String>();
//    names.add("Oleg");
//    names.add("Taras");
//    names.add("Vitali");
//    names.add("Olena");
//    names.add("Taras");
//    System.out.println(names);
//
//    Set<String> names1= new TreeSet<String>();
//    names1.add("Oleg");
//    names1.add("Taras");
//    names1.add("Vitali");
//    names1.add("Olena");
//    names1.add("Taras");
//    System.out.println(names1);
//
//    Set<String> names2= new LinkedHashSet<String>();
//    names2.add("Oleg");
//    names2.add("Taras");
//    names2.add("Vitali");
//    names2.add("Olena");
//    names2.add("Taras");
//    System.out.println(names2);
//    for (Integer s:names;s<1000000;s++){if (s%3==0) System.out.println(s);

    long startTime= Instant.now().getEpochSecond();
            Set<Integer> a= new HashSet<Integer>();
        for (int i = 1; i <=1000000; i++) { a.add(i);}
long endTime= Instant.now().getEpochSecond();
        System.out.println("HashSet time:"+ (endTime-startTime));

}}
