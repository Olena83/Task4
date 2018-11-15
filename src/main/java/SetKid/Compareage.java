package SetKid;

import java.util.Comparator;

public class Compareage  implements Comparator<Kid> { public int compare(Kid a, Kid b){

    if(a.getAge()> b.getAge())
        return 1;
    else if(a.getAge()< b.getAge())
        return -1;
    else
        return 0;
}}
