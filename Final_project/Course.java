// Course.java
// This class represents a course with a code, a name, and a schedule
import java.sql.Time;

public class Course {
    private String code;
    private String name;
    private String schedule;
    private double price;

    private Time startTime;
    private Time endTime;

    // Other properties and methods...

    public Time getStartTime() {
        return this.startTime;
    }

    public Time getEndTime() {
        return this.endTime;
    }

    // A constructor that creates a new course with a given code, name, and schedule
    public Course(String code, String name, String schedule, double price) {
        this.code = code;
        this.name = name;
        this.schedule = schedule;
        this.price = price;
    }

    // A method that returns the code of the course
    public String getCode() {
        return code;
    }

    // A method that returns the name of the course
    public String getName() {
        return name;
    }

    // A method that returns the schedule of the course
    public String getSchedule() {
        return schedule;
    }

    // A method that returns a string representation of the course
    public String toString() {
        return code + " - " + name + " (" + schedule + ")";
    }

    // Getter method for the price
    public double getPrice() {
        return price;
    }
    
    // Setter method for the price (if needed)
    public void setPrice(double price) {
        this.price = price;
    }
}
