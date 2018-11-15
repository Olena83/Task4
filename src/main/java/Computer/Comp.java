package Computer;

public class Comp <T> {
    private String name;
   private int hardDriveSpaсe;
    private T os;

    public Comp (String Newname,int Newhard,T os){this.name=Newname;this.hardDriveSpaсe=Newhard;this.os=os;}

        public String getName() {
            return name; }

        public void setName(String name) {
            this.name = name; }

        public T getOs() {
            return os; }

        public void setOs(T os) {
            this.os = os; }

        public int getHardDriveSpaсe() {
            return hardDriveSpaсe;
        }

        public void setHardDriveSpaсe(int hardDriveSpaсe) {
            this.hardDriveSpaсe = hardDriveSpaсe; }

    }

