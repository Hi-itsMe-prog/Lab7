import java.util.Scanner;

class House {
    public String address;
    public int floor;
    public int rooms;
    public double area;

    public House(String address, int floor, int rooms, double area) {
        this.address = address;
        this.floor = floor;
        this.rooms = rooms;
        this.area = area;
    }


    @Override
    public String toString() {
        return "House{" + "address='" + address + '\'' + ", floor=" + floor + ", rooms=" + rooms + ", area=" + area + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        House[] houses = new House[] {
                new House("Lenina str., 1", 3, 2, 50.5),
                new House("Mira str., 5", 5, 3, 70.0),
                new House("Pobedy ave., 10", 1, 2, 45.0),
                new House("Lenina str., 1", 3, 2, 60.0),
                new House("Gagarina str., 7", 8, 4, 90.0),
                new House("Mira str., 5", 2, 3, 65.0)
        };

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        int a = in.nextInt();

        System.out.println("Apartments with " + a + " rooms are:");
        boolean fA = false;
        for (House house : houses) {
            if (house.rooms == a) {
                System.out.println(house);
                fA = true;
            }
        }
        if (!fA) {
            System.out.println("No apartments found with " + a + " rooms.");
        }


        System.out.println("Enter the room number(2): ");
        int a1 = in.nextInt();
        System.out.println("Enter the floor number: ");
        int b = in.nextInt();
        System.out.println("\nApartments with " + a1 + " rooms on floor " + b + ":");
        boolean fB = false;
        for (House house : houses) {
            if (house.rooms == a1 && house.floor == b) {
                System.out.println(house);
                fB = true;
            }
        }
        if (!fB) {
            System.out.println("No apartments with " + a1 + " rooms on floor " + b + ".");
        }

        System.out.println("Enter the area: ");
        double ar = in.nextDouble();
        System.out.println("\nApartments with area greater than " + ar + ":");
        boolean fC = false;
        for (House house : houses) {
            if (house.area > ar) {
                System.out.println(house);
                fC = true;
            }
        }
        if (!fC) {
            System.out.println("No apartments found with area greater than " + ar + ".");
        }
    }
}