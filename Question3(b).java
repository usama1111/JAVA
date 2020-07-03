import java.util.Scanner;
class Car {
    
   
    private String car_tyres;
    private String car_body;
    private Engine engine;
 private String car_brand;
    private String car_type;
    private String car_color;
    
    public Car(String car_brand, String car_type, String car_color, String car_tyres, String car_body) {
        
        this.car_tyres = car_tyres;
        this.car_body = car_body;
        this.engine = engine;
        
        
        this.car_brand = car_brand;
        this.car_type = car_type;
        this.car_color = car_color;
        
    }

    public void getTrimLevel() {}

    

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }
    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public String getCar_tyres() {
        return car_tyres;
    }

    public void setCar_tyres(String car_tyres) {
        this.car_tyres = car_tyres;
    }

    public String getCar_body() {
        return car_body;
    }

    public void setCar_body(String car_body) {
        this.car_body = car_body;
    }

    @Override
    public String toString() {
        return "Car{" + "car_brand=" + car_brand + ", car_type=" + car_type + ", car_color=" + car_color + ", car_tyres=" + car_tyres + ", car_body=" + car_body + '}';
    }
    
}

class BaseCar extends Car {

    public BaseCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body );
    }

}

class LuxuryCar extends Car {
   
    public LuxuryCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body);
    }
   
}
class SportCar extends Car {
    
    public SportCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body);
    }
    
}

interface Engine {
   
}
interface  ElectricEngine extends Engine{
    
}

  interface PetrolEngine extends Engine {
    
 }


class HybridEngine implements PetrolEngine , ElectricEngine{

}
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Car car = new Car("suzuki", "hhh", "green" , "service", "metalic" );
        
        System.out.println("Car Details");
       
        System.out.println(car.toString());
        System.out.println("Engine Details");
        
        System.out.println("\nEnter Engine Type");
        String type = scanner.next();
        
        
    }    
}

