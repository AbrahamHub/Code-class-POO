public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Doctor myDoctor1 = new Doctor();
        myDoctor1.name = "Abraham";
        myDoctor1.showName();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Oscar";
        myDoctor2.showName();

        Doctor myDoctor3 = new Doctor();
        myDoctor3.name = "Ricardo";
        myDoctor3.showName();
    }
}