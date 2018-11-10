package Computer;

public class app {
    public static void main(String[] args){
    Comp a= new Comp("HP",400);
    Opersustema z =new Windows("Windows") ;
    Comp a1= new Comp("Asus",500);
    Opersustema z1 =new Linux("Linux") ;
    Comp a2= new Comp("Sony",300);
    Opersustema z2=new MacOS("MacOS");
    a.Parametru(z);
    a1.Parametru1(z1);
    a2.Parametru2(z2);
    }

    }


