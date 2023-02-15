import java.util.Scanner;

public class NuclearReactor {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("");
        System.out.println("");
        int count = 0;
        while (count < 6) { // Run the animation for 10 cycles
            System.out.print("Loading ");
            for (int i = 0; i < count; i++) {
                System.out.print("."); // Add a dot for each cycle
            }
            System.out.print("\r"); // Move the cursor back to the beginning of the line
            Thread.sleep(500); // Pause for half a second
            count++;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("Please Fill Following Form");
        System.out.println("");

        System.out.println("Q1. What is the total number of employees? ");
        System.out.print("-> ");
        int totalEmp = input.nextInt();

        System.out.println("Q2. What is the name of supervisor ?");
        input.nextLine();
        System.out.print("-> ");
        String name = input.nextLine();

        System.out.println("Q3. How many times the Nuclear waste is removed from the core?");
        System.out.print("-> ");
        int times = input.nextInt();

        System.out.println("Q4. What is the total weight of the waste produced every 1 week?");
        System.out.print("-> ");
        float weight = input.nextFloat();

        System.out.println("Q5. Is Electric Motor being replaced every 18 days? ");
        System.out.println("Enter “y” for yes and “n” for no ");
        System.out.print("-> ");
        char replaced = input.next().charAt(0);

        System.out.println("Q6. What is the core average temperature ( celsius ) of the Nuclear Reactor? ");
        System.out.print("-> ");
        double temp = input.nextDouble();


        System.out.println("");
        System.out.println("");
        
        System.out.println("Nuclear Reactor: JX00-XC-HB1");
        System.out.println("");
        System.out.println("Total Employees: " + totalEmp);
        System.out.println("Supervisor: " + name);
        System.out.println("Nuclear waster is removed form core " + times + " times till date.");
        System.out.println("Total weight of the waste produced every 1 week: " + weight +"kgs");
        if (replaced == 'y') {
            System.out.println("Electric Motor is being replaced every 18 days.");
        }else{
            System.out.println("Electric Motor is not being replaced every 18 days.");
        }
        System.out.print("The core average temperature of the Nuclear Reactor: " + temp+ "°C" + ", ");
        System.out.print((temp+273.15) + "°F");
        System.out.println("");
        System.out.println("");
        input.close();
    }
}