package New;
class Application{
    String studentName ;
    int mobile;

    static String collegeName ="NEC";

    public void filling(){
        System.out.println("Filling");

    }
}
public class Project {

    public static void main(String[] args) {


        Application besant1 = new Application();
        System.out.println(besant1.mobile = 784545);
        System.out.println(besant1.studentName = "Besant1");

        System.out.println(Application.collegeName="PSG");

        besant1.filling();
        message();

    }
    public static void message(){
        System.out.println("user");
    }
}
