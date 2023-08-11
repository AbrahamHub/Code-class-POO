public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Doctor myDoctor1 = new Doctor();
        myDoctor1.name = "Abraham";
        myDoctor1.showName();
        myDoctor1.showId();

        Doctor myDoctor2 = new Doctor();
        myDoctor2.name = "Oscar";
        myDoctor2.showName();
        myDoctor2.showId();

        //Doctor.id++;

        Doctor myDoctor3 = new Doctor();
        myDoctor3.name = "Ricardo";
        myDoctor3.showName();
        myDoctor3.showId();
    }
}