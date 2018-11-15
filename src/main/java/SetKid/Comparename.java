package SetKid;

import java.util.Comparator;

public class Comparename  implements Comparator<Kid>{
    public int compare(Kid a, Kid b){return a.getName().compareTo(b.getName());
    }
}
