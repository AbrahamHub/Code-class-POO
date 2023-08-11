public class Doctor {
    int id;
    String name;
    String speciality;

    public void showName() {
        System.out.println(name);
    }
    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }
}
