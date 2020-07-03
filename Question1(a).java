import java.util.Scanner;
class Car {
    
   
    private String car_tyres;
    private String car_body;
    private Engine engine;
 private String car_brand;
    private String car_type;
    private String car_color;
    
    public Car(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        
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
public String getCar_body() {
        return car_body;
    }

    public void setCar_body(String car_body) {
        this.car_body = car_body;
    }
    public String getCar_tyres() {
        return car_tyres;
    }

    public void setCar_tyres(String car_tyres) {
        this.car_tyres = car_tyres;
    }

    

    @Override
    public String toString() {
        return "Car{" + "car_brand=" + car_brand + ", car_type=" + car_type + ", car_color=" + car_color + ", car_tyres=" + car_tyres + ", car_body=" + car_body + '}';
    }
    
}

class BaseCar extends Car {

    public BaseCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body, engine);
    }

}

class LuxuryCar extends Car {
   
    public LuxuryCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body, engine);
    }
   
}
class SportCar extends Car {
    
    public SportCar(String car_brand, String car_type, String car_color, String car_tyres, String car_body, Engine engine) {
        super(car_brand, car_type, car_color, car_tyres, car_body, engine);
    }
    
}
class Engine {
   
    private double engine_size;
    private double engine_accelerate;
    private int engine_fuel_level; 
    private String engine_type;
    private String engine_manfacture;
   

    public Engine(String engine_type, String engine_manfacture, double engine_size, double engine_accelerate, int engine_fuel_level) {
        this.engine_type = engine_type;
        this.engine_manfacture = engine_manfacture;
        this.engine_size = engine_size;
        this.engine_accelerate = engine_accelerate;
        this.engine_fuel_level = engine_fuel_level;
    }

    public void checkEngineTypeHybride(String type) {
        if(this.engine_type == type) {
            System.out.println("The engine runs on both electric and petrol");
        } else {
            System.out.println("The engine type : " + type);
        }
    }
    
    public String accelerate() {
        return this.getEngine_accelerate() + " ms";
    }
    
    public String getFuelLevel() {
        return this.getEngine_fuel_level() + " liters";
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public String getEngine_manfacture() {
        return engine_manfacture;
    }

    public void setEngine_manfacture(String engine_manfacture) {
        this.engine_manfacture = engine_manfacture;
    }

    public double getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(double engine_size) {
        this.engine_size = engine_size;
    }

    public double getEngine_accelerate() {
        return engine_accelerate;
    }

    public void setEngine_accelerate(double engine_accelerate) {
        this.engine_accelerate = engine_accelerate;
    }

    public int getEngine_fuel_level() {
        return engine_fuel_level;
    }

    public void setEngine_fuel_level(int engine_fuel_level) {
        this.engine_fuel_level = engine_fuel_level;
    }

    @Override
    public String toString() {
        return "Engine{" + "engine_type=" + engine_type + ", engine_manfacture=" + engine_manfacture + ", engine_size=" + engine_size + ", engine_accelerate=" + engine_accelerate + ", engine_fuel_level=" + engine_fuel_level + '}';
    }

    
}
 class ElectricEngine extends Engine {
    
    public ElectricEngine(String engine_type, String engine_manfacture, float engine_size, float engine_accelerate, int engine_fuel_level) {
    
        super(engine_type, engine_manfacture, engine_size, engine_accelerate, engine_fuel_level);
    }
    
}

class PetrolEngine extends Engine {
    
    public PetrolEngine(String engine_type, String engine_manfacture, float engine_size, float engine_accelerate, int engine_fuel_level) {
        super(engine_type, engine_manfacture, engine_size, engine_accelerate, engine_fuel_level);
    }
    
}
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Engine engine = new Engine("Hybride", "MFR", 11.9, 19.0, 3000);
        Car car = new Car("suzuki", "8 Pali", "green" , "service", "metalic" ,engine);
        
        System.out.println("Car Details");
       
        System.out.println(car.toString());
        System.out.println("Engine Details");
        
        System.out.println(engine.toString());
        System.out.println("\nEnter Engine Type");
        String type = scanner.next();
        
        engine.checkEngineTypeHybride(type);
       
    }    
}

