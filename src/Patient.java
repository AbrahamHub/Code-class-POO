public class Patient {
    int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;
    private double height;
    String blood;

    Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}