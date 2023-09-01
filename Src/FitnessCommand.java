public class FitnessCommand {

    public static void main(String[] args){
        FitnessTracker john = new FitnessTracker("John", 15, 6, 1990,
                "john@example.com", "+1234567890","Doe",100,"90/130",500);

        john.printAccountInfo();
        john.setSurname("Doe");
        john.setWeight(75.5);
        john.setBloodPressure("120/80");
        john.setStepsPerDay(10000);
        john.printAccountInfo();

        FitnessTracker alice = new FitnessTracker("Alice", 20, 3, 1985, "alice@example.com", "+9876543210","Lupin",
                110,"95/127",5000);

        alice.printAccountInfo();
        alice.setSurname("Lupin");
        alice.setWeight(62.0);
        alice.setBloodPressure("130/85");
        alice.setStepsPerDay(8000);
        alice.printAccountInfo();

        FitnessTracker bob = new FitnessTracker("Bob", 10, 8, 2000, "bob@example.com", "+1122334455","Haim",
                150,"80/137",250);

        bob.printAccountInfo();
        bob.setSurname("Haim");
        bob.setWeight(120);
        bob.setBloodPressure("90/120");
        bob.setStepsPerDay(750);
        bob.printAccountInfo();

        System.out.println(john);

        System.out.println(alice);

        System.out.println(bob);
    }
}
