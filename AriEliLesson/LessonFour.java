package AriEliLessons.AriEliLesson;

public class LessonFour {
    /*
    OOP - Object Oriented Programming
    - Faster
    - Easier to understand
     */
    public static void main(String[] args){

        // how you make an instance of the class
        Car civic = new Car("combustion", 105.0);
        System.out.println(civic.wheels);

        Car ferrari = new Car("combustion", 220.0);
        System.out.println(ferrari.wheels);

        civic.driveCar();
        ferrari.driveCar();

        System.out.println(ferrari.toString());
        System.out.println(civic.toString());

        civic.setVin("J09OL");
        ferrari.setVin("7NB9C");
        System.out.println(civic.getVin() + " " + ferrari.getVin());
    }
}

/*
Car class

Attributes:
- Wheels

 */
class Car {
    public String powerType;
    public double topSpeed;
    final int wheels = 4; // Final variable, can't change it
    private String vin;
    public void driveCar(){
        System.out.println("I am driving the car");
    }

    public Car(String powerType, double topSpeed){
        System.out.println("made a new car");
        this.topSpeed = topSpeed;
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "powerType='" + powerType + '\'' +
                ", topSpeed=" + topSpeed +
                ", wheels=" + wheels +
                '}';
    }

    public String getVin(){
        return this.vin;
    }

    public void setVin(String nVin){
        this.vin = nVin;
    }
}
/*
Make a new class for a student

Attributes:
- GPA (float)
- Name (String)
- Age (int)
- Method to print these attributes out
 */
