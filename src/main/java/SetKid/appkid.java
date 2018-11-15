package SetKid;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class appkid {public static void main (String[] args) {

//    Comparator<Kid> ppp = new Compareage().thenComparing(new Comparename());
//    TreeSet<Kid> kids = new TreeSet(ppp);
//    kids.add(new Kid("Oleg",13));
//    kids.add(new Kid("Olga",2));
//    kids.add(new Kid("Dmutro",16));
//    kids.add(new Kid("Natalia",6));
//    kids.add(new Kid("Bogdan",10));
//    kids.add(new Kid("Nadia",7));
//    for(Kid  p : kids){
//        System.out.println(p.getAge() + " " + p.getName());

    Set<Kid> kids = new HashSet<>();
    kids.add(new Kid("Oleg",13));
    kids.add(new Kid("Olga",2));
    kids.add(new Kid("Dmutro",16));
    kids.add(new Kid("Natalia",6));
    kids.add(new Kid("Bogdan",11));
    kids.add(new Kid("Nadia",7));
    kids.add(new Kid("Iruna",15));
    kids.add(new Kid("Olexandr",1));
    kids.add(new Kid("Maria",8));
    kids.add(new Kid("Taras",14));

    for (Kid i : kids){if (i.getAge()<10)
    System.out.println("oбєкти <10 років:"+i.getName()+" "+i.getAge());}

    for (Kid k : kids){if (k.getAge()>10)
        System.out.println("name: "+k.getName()+", age:"+k.getAge());}}}


