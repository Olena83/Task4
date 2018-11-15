package Computer;

public class app {
    public static void main(String[] args){
        Opersustema z =new Windows("Windows 8") ;
        Opersustema z1 =new Linux("Ubuntu");
        Opersustema z2=new MacOS("MacOS");

        Comp<Windows> windowsComputer = new Comp("HP", 32,z);
        Comp<Linux> linuxComputer = new Comp("Asus", 33,z1);
        Comp<MacOS> macOSComputer = new Comp("macOSComputer", 32,z2);

        System.out.println("Назва оперсистеми: "+ windowsComputer.getOs().getNazva()
                +", назва компа: "+windowsComputer.getName()+ ", оперпамять: "+ windowsComputer.getHardDriveSpaсe()+"гб");
        System.out.println("Назва оперсистеми: "+ linuxComputer.getOs().getNazva()
                +", назва компа: "+linuxComputer.getName()+ ", оперпамять: "+ linuxComputer.getHardDriveSpaсe()+"гб");
        System.out.println("Назва оперсистеми: "+ macOSComputer.getOs().getNazva()
                +", назва компа: "+macOSComputer.getName()+ ", оперпамять: "+ macOSComputer.getHardDriveSpaсe()+"гб");
    }

    }


