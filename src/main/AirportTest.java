package main;

import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {

    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        Plane p1 = planeService.createPlane();
        Plane p2 = planeService.createPlane();
        Plane p3 = planeService.createPlane();
        boolean isActive = true;

        Scanner s = new Scanner(System.in);
        while (isActive) {
            System.out.println("Enter command number: ");
            System.out.println("1. print cost and topSpeed if the plane is military otherwise print model and country.");
            System.out.println("2. return the plane which one is newer (if they have the same age return first one).");
            System.out.println("3. print country of the plane with smallest seats count (if they have the same - print first).");
            System.out.println("4. print all not military planes.");
            System.out.println("5. print all military planes which were in air more than 100 hours.");
            System.out.println("6. return the plane with minimal weight (if there are some of them return last one).");
            System.out.println("7. return the plane with minimal cost from all military planes (if there are some of them return first one).");
            System.out.println("8. print planes in ascending form order by year");
            System.out.println("9. create plane.");
            System.out.println("10. Exit!");

            int command = s.nextInt();

            switch (command) {
                case 1:
                    planeService.planeIsMilitary(p1);
                    break;
                case 2:
                    planeService.printInfo(planeService.theNewestPlane(p1, p2));
                    break;
                case 3:
                    planeService.printThePlaneWithSmallestSeats(p1, p2, p3);
                    break;
                case 4:
                    planeService.allNotMilitaryPlanes(new Plane[]{p1, p2, p3});
                    break;
                case 5:
                    planeService.allMilitaryPlanesWhichInAirMoreThen100Hours(new Plane[]{p1, p2, p3});
                    break;
                case 6:
                    planeService.printInfo(planeService.planeWithMinWeight(new Plane[]{p1, p2, p3}));
                    break;
                case 7:
                    planeService.printInfo(planeService.planeWithMinCoast(new Plane[]{p1, p2, p3}));
                    break;
                case 8:
                    Plane[] planes = new Plane[]{p1, p2, p3};
                    planeService.planesInAscendingFormOrderByYear(planes);
                    planeService.printPlanesModel(planes);
                    break;
                case 9:
                    Plane plane = planeService.createPlane();
                    break;
                case 10:
                    isActive = false;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid command! Please try again.");
            }
        }
    }
}
