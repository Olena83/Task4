package SetKid;
import java.util.*;
import java.util.Comparator;

public class appkid {public static void main (String[] args) {

    Comparator<Kid> ppp = new Compareage().thenComparing(new Comparename());
    TreeSet<Kid> kids = new TreeSet(ppp);
    kids.add(new Kid("Oleg",13));
    kids.add(new Kid("Olga",2));
    kids.add(new Kid("Dmutro",16));
    kids.add(new Kid("Natalia",6));
    kids.add(new Kid("Bogdan",10));
    for(Kid  p : kids){
        System.out.println(p.getAge() + " " + p.getName());


}
}}

