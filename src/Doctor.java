public class Doctor {
    static int id=0; // Autoincrement
    String name;
    String speciality;

    public void showName() {
        System.out.println(name);
    }
    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor (String name) {
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
