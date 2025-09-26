import java.util.Scanner;

public class Compensation {

    // Calculate Year-End Bonus
    public static int calculateBonus(int project, int performance) {
        if (project < 1 || performance < 0 || performance > 100) {
            return -1; // Invalid input
        }
        if (performance < 80) {
            return 0; // No Bonus
        }

        if (project <= 2) {
            return (performance < 90) ? 30 : 40;
        } else if (project <= 4) {
            return (performance < 90) ? 60 : 70;
        } else {
            return (performance < 90) ? 90 : 100;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the payroll system!");
        System.out.print("Enter project number: ");
        int project = sc.nextInt();

        System.out.print("Performance (%): ");
        int performance = sc.nextInt();

        int bonus = calculateBonus(project, performance);

        if (bonus == -1) {
            System.out.println("Invalid input!");
        } else if (bonus == 0) {
            System.out.println("No Year-end Bonus!");
        } else {
            System.out.println("Year-end Bonus: " + bonus + "tr (VND)");
        }

        sc.close();
    }
}
