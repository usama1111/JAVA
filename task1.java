import java.util.Scanner;

interface releaseCarbonFootprint{
     float getCarbonFootprint();
}

class Building implements releaseCarbonFootprint{
    public int energy;
    public int gas;
    private float emission= 0.82f;
    private float emission2=11.7f;
    public float total;

    
    public float getCarbonFootprint() {
        Scanner obj = new Scanner(System.in);
        System.out.print("\nThe energy that electricity consume is of watt ");
        energy = obj.nextInt();
        System.out.println(+emission *energy+" kilogram of carbon is produced by electricity");

        System.out.print("The therms that natural gas consume is of therms ");
        gas= obj.nextInt();
        System.out.println(+emission2 *gas+" kilogram of carbon is produced by Natural Gas");

        System.out.print("The total Kilogram of carbon footprint are ");
        return total= (emission*energy+emission2*gas);
    }
}

class Car implements releaseCarbonFootprint{
     public float litre;
     private float Diesel=2640/100;
     private float Petrol=2392/100;
     private float LPG=1665/100;
     private float H_CNG=2252/100;
     private float L_CNG=2666/100;
     public float result;


    
    public float getCarbonFootprint() {
        Scanner obj = new Scanner(System.in);
        System.out.print("\nThe litre of fuel you use is ");
        litre = obj.nextFloat();
        System.out.println("Choose your fuel type");
        System.out.println("If its Diesel press 1");
        System.out.println("If its Petrol press 2");
        System.out.println("If its LPG press 3");
        System.out.println("If its High Calorific CNG press 4");
        System.out.println("If its Low Calorific CNG press 5");
        return check();
    }

    public float check(){
        Scanner obj = new Scanner(System.in);
        System.out.print("\nMention your type ");
        String choose = obj.nextLine();

        if(choose.equals("D") || choose.equals("d")){
            System.out.println(" The kilogram of carbon footprint made due to Diesel are");
            result = Diesel*litre;

        }
        else if(choose.equals("P")|| choose.equals("p")){
            System.out.println(" The kilogram of carbon footprint made due to Petrol are");
            result = Petrol*litre;

        }
        else if(choose.equals("G") || choose.equals("g")){
            System.out.println(" The kilogram of carbon footprint made due to LPG are");
            return LPG*litre;

        }
        else if(choose.equals("L") || choose.equals("l")){
            System.out.println(" The kilogram of carbon footprint made due to Low Calorific CNG are");
            return L_CNG*litre;

        }
        else if(choose.equals("H") || choose.equals("h")){
            System.out.println(" The kilogram of carbon footprint made due to High Calorific CNG are");
            return H_CNG*litre;
        }
        return result;
    }
}


class Bicycle implements releaseCarbonFootprint{
 public float km;
 public int carbon =16;
    
    public float getCarbonFootprint() {
        Scanner obj = new Scanner(System.in);
        System.out.print("\nEnter kilometers you have ride bicycle ");
        km = obj.nextFloat();
        System.out.print("Number of carbon per km in grams are ");
    return km * carbon;
    }
}

public class task1{

    public static void main(String[] args) {
        System.out.println("\nThe carbon release detail is here\n");

        Building building = new Building();
        Car car = new Car();
        Bicycle bike = new Bicycle();

        System.out.println("For Building press 1");
        System.out.println("For Car press 2");
        System.out.println("For Bicycle press 3");

        Scanner obj = new Scanner(System.in);

        System.out.print("\nChoose one of them ");
        int select = obj.nextInt();
        switch(select)
        {
        case 1:
        {
            System.out.println(building.getCarbonFootprint());
            break;
        }
        case 2:
        {
            System.out.println(car.getCarbonFootprint());
            System.out.println(car.check());
            break;
        }
        case 3:
        {
            System.out.println(bike.getCarbonFootprint());
            break;
        }
        default:
        {
            System.out.println("Enter wrong Choose");
            break;
        }
    }



    }
}