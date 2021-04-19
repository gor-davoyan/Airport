package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();

        System.out.println("Enter plane model (Any not empty string): ");
        String model = s.next();
        plane.setModel(model);

        System.out.println("Enter which country plane belongs to (Any not empty string): ");
        String country = s.next();
        plane.setCountry(country);

        System.out.println("Enter year of publishing (from 1903 to 2020): ");
        int year = s.nextInt();
        plane.setYear(year);

        System.out.println("is military (yes/no): ");
        boolean isMilitary = s.next().charAt(0) == 'y';
        plane.setMilitary(isMilitary);

        System.out.println("Enter weight of plane (from 1000 KG to 160000 KG): ");
        double weight = s.nextDouble();
        plane.setWeight(weight);

        System.out.println("Enter maximal speed per hour (any not negative value): ");
        int topSpeed = s.nextInt();
        plane.setTopSpeed(topSpeed);

        System.out.println("Enter number of seats in plane (any not negative value): ");
        int numSeats = s.nextInt();
        plane.setSeats(numSeats);

        System.out.println("Enter coast (any not negative value): ");
        long coast = s.nextLong();
        plane.setCost(coast);

        System.out.println("Enter hours in air (from 0 to 10000): ");
        double hours = s.nextDouble();
        plane.setHours(hours);

        return plane;
    }

    public void planeIsMilitary(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("coast: " + plane.getCost() + "$\ntopSpeed: " + plane.getTopSpeed() + " km/h");
        } else {
            System.out.println("model: " + plane.getModel() + "\ncountry: " + plane.getCountry());
        }
    }

    public Plane theNewestPlane(Plane p1, Plane p2) {
        return p1.getYear() >= p2.getYear() ? p1 : p2;
    }

    public void printThePlaneWithSmallestSeats(Plane p1, Plane p2, Plane p3) {
        Plane minSeats = p1.getSeats() > p2.getSeats() ? p2 : p1;

        if (minSeats.getSeats() > p3.getSeats()) {
            minSeats = p3;
        }

        System.out.println(minSeats.getCountry());
    }

    public void allNotMilitaryPlanes(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                printInfo(plane);
            }
        }
    }

    public void allMilitaryPlanesWhichInAirMoreThen100Hours(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                printInfo(plane);
            }
        }
    }

    public Plane planeWithMinWeight(Plane[] planes) {
        Plane minWeightPlane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minWeightPlane.getWeight()) {
                minWeightPlane = planes[i];
            }
        }

        return minWeightPlane;
    }

    public Plane planeWithMinCoast(Plane[] planes) {
        Plane minCoastPlan = planes[0];
        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getCost() < minCoastPlan.getCost()) {
                minCoastPlan = plane;
            }
        }

        return minCoastPlan;
    }

    public void planesInAscendingFormOrderByYear(Plane[] planes) {
        boolean isActive = true;
        int length = planes.length - 1;

        while (isActive) {
            isActive = false;
            for (int i = 0; i < length; i++) {
                if (planes[i].getYear() > planes[i + 1].getYear()) {
                    Plane p = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = p;
                    isActive = true;
                }
            }
            length--;
        }
    }

    public void printInfo(Plane plane) {
        System.out.println("model: " + plane.getModel());
        System.out.println("country: " + plane.getCountry());
        System.out.println("year: " + plane.getYear());
        System.out.println("hours in air: " + plane.getHours());
        System.out.println("is military: " + (plane.isMilitary() ? "Yes" : "No"));
        System.out.println("weight: " + plane.getWeight());
        System.out.println("maximal speed per hour : " + plane.getTopSpeed());
        System.out.println("seats: " + plane.getSeats());
        System.out.println("coast: " + plane.getCost());
        System.out.println("--------------------------");
    }

    public void printPlanesModel(Plane[] planes) {
        for (Plane plane : planes) {
            System.out.println("model: " + plane.getModel());
        }
    }
}
