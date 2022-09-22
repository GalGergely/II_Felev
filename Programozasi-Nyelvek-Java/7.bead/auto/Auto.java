package auto;
import auto.utils.Color;

public class Auto {
    String plate;
    Color color;
    int maxSpeed;
    int cntr=0;

    public Auto(String plate, Color color, int maxSpeed, int cntr){
        this.plate = plate;
        this.color = color;
        this.maxSpeed = maxSpeed;
        cntr++;
    }
    public Auto(){
        this.plate = "AAA-000";
        this.color = Color.BLUE;
        this.maxSpeed = 120;
        cntr++;
    }
    public boolean speedTest(Auto a, Auto b){
        if(a.maxSpeed>b.maxSpeed){
            return true;
        }
        else{
            return false;
        }
    }
    public void cutter(String line){
        String[] parts = line.split(",");
        this. plate = parts[0];
        this.maxSpeed=Integer.praseInt(parts[2]);

    }

}
