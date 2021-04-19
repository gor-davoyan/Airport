package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean military;
    private double weight;
    private double topSpeed;
    private int seats;
    private long cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Invalid model! Try again.");
        } else {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.isEmpty()) {
            System.out.println("Invalid country! Try again.");
        } else {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Invalid year! Try again.");
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours > 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Invalid value! Try again.");
        }

    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 1000 && weight < 160000) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value! Try again.");
        }

    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (topSpeed < 0) {
            System.out.println("Invalid value! Try again.");
        } else {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats < 0) {
            System.out.println("Invalid value! Try again.");
        } else {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(long cost) {
        if (cost < 0) {
            System.out.println("Invalid value! Try again.");
        } else {
            this.cost = cost;
        }

    }
}
