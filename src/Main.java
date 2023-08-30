public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Abraham", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "abraham_apple@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);
    }
}