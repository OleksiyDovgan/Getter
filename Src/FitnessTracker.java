public class FitnessTracker {

    int age ;

    private  String name;

    private  int birthDay;

    private  int birthMonth;

    private  int birthYear;

    private  String email;

    private  String phone;

    private String surname;

    private double weight;

    private String bloodPressure;

    private int stepsPerDay;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone, String surname, double weight, String bloodPressure, int stepsPerDay) {

        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        calculateAge();

    }

    public String getName() {

        return name;

    }

    public int getBirthDay() {

        return birthDay;

    }

    public int getBirthMonth() {

        return birthMonth;

    }

    public int getBirthYear() {

        return birthYear;

    }

    public String getEmail() {

        return email;

    }

    public String getPhone() {

        return phone;

    }

    public String getSurname() {

        return surname;

    }

    public double getWeight() {

        return weight;

    }

    public String getBloodPressure() {

        return bloodPressure;

    }

    public int getStepsPerDay() {

        return stepsPerDay;

    }

    public void setSurname(String surname) {

        this.surname = surname;

    }

    public void setWeight(double weight) {

        this.weight = weight;

    }

    public void setBloodPressure(String bloodPressure) {

        this.bloodPressure = bloodPressure;

    }

    public void setStepsPerDay(int stepsPerDay) {

        this.stepsPerDay = stepsPerDay;

    }

    private void calculateAge() {

        int currentYear = 2023;

        age = currentYear - birthYear;

    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps Per Day: " + stepsPerDay);
        System.out.println();
    }

    @Override
    public String toString() {
        return "FitnessTracker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ", birthYear=" + birthYear +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", bloodPressure='" + bloodPressure + '\'' +
                ", stepsPerDay=" + stepsPerDay +
                '}';
    }
}
