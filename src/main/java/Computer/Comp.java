package Computer;

public class Comp {
    String name;
    int hardDriveSpaсe;

    Comp (String Newname,int Newhard){this.name=Newname;this.hardDriveSpaсe=Newhard;}

    public void Parametru (Opersustema z){
        System.out.println
                ( "Назва компа: "+ name +" ,память становить :" + hardDriveSpaсe +
                        "ГБ "+", назва оперсистеми "+ z.getClass().getName());}
        public void Parametru1 (Opersustema z1){
        System.out.println( "Назва компа: "+ name +" ,память становить :" + hardDriveSpaсe +
                "ГБ "+", назва оперсистеми "+ z1.getClass().getName());}
    public void Parametru2 (Opersustema z2){
        System.out.println("Назва компа: "+ name +" ,память становить :" + hardDriveSpaсe +
                "ГБ "+", назва оперсистеми "+ z2.getClass().getName());
    }
}
