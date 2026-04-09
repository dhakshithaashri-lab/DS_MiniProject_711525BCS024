import java.util.PriorityQueue;
import java.util.Scanner;

class Vehicle implements Comparable<Vehicle> {
    int id;
    String type;
    int congestion;
    int travelTime;
    int priority;

    Vehicle(int id, String type, int congestion, int travelTime) {
        this.id = id;
        this.type = type;
        this.congestion = congestion;
        this.travelTime = travelTime;

        // Priority rule
        if (type.equalsIgnoreCase("Emergency"))
            priority = 1;
        else
            priority = 2;
    }

    public int compareTo(Vehicle v) {
        if (this.priority != v.priority)
            return this.priority - v.priority;
        return this.travelTime - v.travelTime;
    }

    public void display() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Congestion: " + congestion);
        System.out.println("Travel Time: " + travelTime);
        System.out.println("Priority: " + priority);
        System.out.println("---------------------");
    }
}

public class SmartTrafficSystem {

    static PriorityQueue<Vehicle> heap = new PriorityQueue<>();
    static Scanner sc = new Scanner(System.in);

    static void insertVehicle() {
        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Vehicle Type (Emergency/Normal): ");
        String type = sc.next();

        System.out.print("Enter Congestion Level: ");
        int congestion = sc.nextInt();

        System.out.print("Enter Travel Time: ");
        int time = sc.nextInt();

        Vehicle v = new Vehicle(id, type, congestion, time);
        heap.add(v);

        System.out.println("Vehicle inserted successfully.");
    }

    static void displayVehicles() {
        if (heap.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }

        for (Vehicle v : heap) {
            v.display();
        }
    }

    static void processVehicle() {
        if (heap.isEmpty()) {
            System.out.println("No vehicles to process.");
            return;
        }

        Vehicle v = heap.poll();
        System.out.println("Processing highest priority vehicle:");
        v.display();
    }

    static void searchVehicle() {
        System.out.print("Enter Vehicle ID to search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (Vehicle v : heap) {
            if (v.id == id) {
                System.out.println("Vehicle found:");
                v.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("Vehicle not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\nSMART TRAFFIC SYSTEM");
            System.out.println("1. Insert Vehicle");
            System.out.println("2. Display Vehicles");
            System.out.println("3. Process Highest Priority Vehicle");
            System.out.println("4. Search Vehicle");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertVehicle();
                    break;

                case 2:
                    displayVehicles();
                    break;

                case 3:
                    processVehicle();
                    break;

                case 4:
                    searchVehicle();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
