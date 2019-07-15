package Inheritance;

import java.util.Scanner;
public class Test {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        bike bike1= new bike();

        Car i10 = new Car(4,"Hyundai","I10",220);
        System.out.println("\nSpeed: "+i10.getSpeed()+" KM/hr\nWheel count: "+i10.getWheelCount()+"\nMileage: "+i10.calculateMilage(50,8)+" KM/l");
        System.out.println("Model: "+i10.getModel()+"\nBrand: "+i10.getBrand());


        //Bike class...

        System.out.println("Enter the Inheritance.bike information...");

        System.out.print("Model: ");
        bike1.setModel(sc.next());

        System.out.print("Brand: ");
        bike1.setBrand(sc.next());

        System.out.print("Speed (km/hr): ");
        bike1.setSpeed(sc.nextInt());

        System.out.print("Abs support (true/false): ");
        bike1.setAbsSupport(sc.nextBoolean());

        if(bike1.hasABS())
        {
            System.out.print("ABS channel: ");
            bike1.setAbsChannels(sc.nextInt());
        }

        bike1.displayBikeInfo();

    }

}
