import java.util.ArrayList;

class Administrator {
    
    private int capcity;
    private boolean saftey;
    private boolean healthy;

    public Administrator(int capcity, boolean saftey, boolean healthy) {
        this.capcity = capcity;
        this.saftey = saftey;
        this.healthy = healthy;
    }

    public Administrator() {
    }
    
    public boolean accessVenue(int capacity, boolean saftey, boolean healthy) {
        this.capcity = capacity;
        this.saftey = saftey;
        this.healthy = healthy;
     
        if(capacity > 10000) {
            if(saftey && healthy) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
    
    
    public void produceMedicalTable() {
        if(this.healthy) {
            System.out.println("\nMedical Table is all Good.");
        } else {
            System.out.println("\nMedical Table suggect the Health issues.");
        }
    }
    
}
class OverseasAthletes {

    public OverseasAthletes() {}
    
    public void applyForVisa(boolean visa) {
        if(visa) {
            System.out.println("\nCongratulation! Visa is issued");
        } else {
        
        
            System.out.println("\nIt took time to issue visa");
        }
    }
}
 class Athletes extends OverseasAthletes {
    
    private Date birthDate;
    private Programme program;
private String athlete_address;
    private String athlete_name;
    
    
    public Athletes (String athlete_name, String athlete_address, Date birthDate, Programme program) {
       
        this.birthDate = birthDate;
        this.program = program;
       this.athlete_name = athlete_name;
        this.athlete_address = athlete_address;
       
    }
    
    public void registerForEvent() {
        if(this.athlete_name != "" && this.athlete_name != "") {
            System.out.println("\nCongratulations! The athlete has been registered For the event");
        } else {
            System.out.println("\nSorry! The athlete has not been registered For the event, Information is missing");
        }
    }

 
    public String getAthlete_address() {
        return athlete_address;
    }

    public void setAthlete_address(String athlete_address) {
        this.athlete_address = athlete_address;
    }
   public String getAthlete_name() {
        return athlete_name;
    }

    public void setAthlete_name(String athlete_name) {
        this.athlete_name = athlete_name;
    }

    @Override
    public void applyForVisa(boolean visa) {
        super.applyForVisa(visa);
    }

    @Override
    public String toString() {
        return "Athletes{" + "athlete name=" + athlete_name + ", athlete address=" + athlete_address + ", birthDate = " + birthDate + ", program = " + program + '}';
    }
    
}

class Programme {
    private Date date;
    private String time;
    private int program_id;
    private String program_name;
    private String location;

    public Programme(int program_id, String program_name, Date date, String time, String location) {
        this.program_id = program_id;
        this.time = time;
        this.location = location;
    this.program_name = program_name;
        this.date = date;
    }

    public int getProgram_id() {
        return program_id;
    }

    public void setProgram_id(int program_id) {
        this.program_id = program_id;
    }

    public String getProgram_name() {
        return program_name;
    }

    public void setProgram_name(String program_name) {
        this.program_name = program_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Programme{" + "program id=" + program_id + ", program name=" + program_name + ", date =" + date + ", time =" + time + ", location =" + location + '}';
    }
    
}
class Date {
   
    private int year;
     
    private String month;
   
   private int day;

    public Date(String month, int year, int day) {
           this.month = month;
           this.year = year;
           this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    @Override
    public String toString() {
        return "Date{" + "month =" + month + ", year =" + year + ", day =" + day + '}';
    }
    
}
class Organizers {
    
    private boolean isCompleted;
    private ArrayList<Programme> programs;
    

    public Organizers(ArrayList<Programme> programs) {
     this.programs = programs;
        
     this.programs = new ArrayList<>();
    }

    public void programCompleted() {
        if(this.getIsCompleted()) {
            System.out.println("All the Programs are completed  ");
        } else {
            System.out.println("Programs are still remaining");
        }
    } 
    public void bookVenue() {
        if(this.programs != null) {
            System.out.println("Congralutions! The Venue is approved");
        } else {
            System.out.println("Sorry! The Venue is not approved");
        }
    }
    
    
    public void produceSchedule() {
        for(Programme p: this.programs) {
            p.toString();
        
        }
   }
    
   
    
    public void produceResults() {
        for(int i = 0 ; i < this.programs.size(); i++) {
            System.out.println("Position " + i + " goes to " + this.programs.get(i).getProgram_name());
        }
    }
    
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    public boolean getIsCompleted() {
        return isCompleted;
    }

    
    
}


class Test {
    public static void main(String[] args) {
        
        Date athleteDate = new Date("Feburay", 1993, 5);
        Date athlete1Date = new Date("November", 1990, 20);
        Date progDate = new Date("May", 2018, 10);
        
        Programme programme =  new Programme(2, "Tennis", new Date("March", 2019, 2), "12:00", "MAJU");
        Programme programme1 =  new Programme(2, "Tennis", new Date("March", 2019, 2), "12:00", "MAJU");
        
        Athletes[] athletes = new Athletes[2];
        athletes[0] = new Athletes("Sultan", "Lyari", athleteDate, programme); 
        athletes[1] = new Athletes("Sania Mirza", "Mumbai", athlete1Date, programme1);
        
        ((OverseasAthletes)athletes[1]).applyForVisa(true);
        
        for(int i = 0 ; i < athletes.length ; i++ ) {
            System.out.println(athletes[i].toString());
            athletes[i].registerForEvent();
        }
        
        ArrayList<Programme> programmes = new ArrayList<Programme>();
        programmes.add(programme);
        programmes.add(programme1);
        
        Administrator admin = new Administrator();
        if(admin.accessVenue(15000, true, true)) {
            Organizers organize = new Organizers(programmes);
            organize.bookVenue();
            organize.produceSchedule();
            organize.setIsCompleted(true);
            organize.programCompleted();
            organize.produceResults();
            admin.produceMedicalTable();
        }
        
        
    }
}
