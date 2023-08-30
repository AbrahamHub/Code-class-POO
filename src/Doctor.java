import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id=0; // Autoincrement
    private String name;
    private String email;
    private String speciality;

    public void showName() {
        System.out.println(name);
    }
    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor (String name, String speciality) {
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }


    ArrayList<AviableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AviableAppointment(date, time));
    }
    public ArrayList<AviableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AviableAppointment {
        private int id;
        private Date date;
        private String time;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public AviableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

    }}
