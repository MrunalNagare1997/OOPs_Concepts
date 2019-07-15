package Inheritance;

public class Vehical{

    private int wheelcount;
    private int speed;

    public Vehical()
    {

    }
    public Vehical(int wheelcount, int speed)
    {
        this.speed=speed;
        this.wheelcount=wheelcount;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWheelcount(int wheelcount) {
        this.wheelcount = wheelcount;
    }

    int getSpeed(){
        return speed;
    }
    int getWheelCount(){
        return wheelcount;
    }
    float calculateMilage(float distanceTraveled, float fuelConsumed){
        return (distanceTraveled/fuelConsumed);
    }

}

class Car extends Vehical {

    private String brand;
    private String model;


    public Car(int count, String brand, String model, int speed) {

        super(speed,count);
        this.brand = brand;
        this.model = model;

    }

    public String getModel() {
        return (model);
    }

    public String getBrand() {
        return (brand);
    }

}

class bike extends Vehical {

    private String brand;
    private String model;
    private boolean absSupport;
    private int absChannels;


    public  bike ()
    {
        super(2, 150);
        this.brand = "N/A";
        this.model = "N/A";
        this.absSupport =false;
        this.absChannels = 0;
    }
    public bike(int speed, String brand, String model, boolean absSupport, int absChannels) {
        super(2, speed);
        this.brand = brand;
        this.model = model;
        this.absSupport = absSupport;
        this.absChannels = absChannels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAbsSupport(boolean absSupport) {
        this.absSupport = absSupport;
    }

    public void setAbsChannels(int absChannels) {

        if(absChannels!= 1 && absChannels!= 2)
            this.absChannels=0;
        this.absChannels = absChannels;

    }

    public String getModel() {
        return model;
    }

    public boolean isAbsSupport() {
        return absSupport;
    }

    public int getAbsChannels() {
        return absChannels;
    }

    public boolean hasABS()
    {
        return absSupport;
    }

    public boolean getAbsSupport()
    {
        return absSupport;
    }

    public void displayBikeInfo()
    {
        System.out.println("Bike Info...");
        System.out.print("\nModel: "+getModel());
        System.out.print("\nBrand: "+getBrand());
        System.out.print("\nSpeed: "+getSpeed());
        System.out.print("\nABS Support: "+getAbsSupport());

        if(!absSupport)
            return;
        System.out.print("\nABS Channels: ");
        if(absChannels==2)
        {
            System.out.println("Double Channel ABS");
        }
        else
            System.out.println("Single channel ABS");
    }

}
