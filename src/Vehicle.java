public class Vehicle {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int speedUp(){
       this.speed = speed;

        return 0;
    }

    public int speedUp(int speedupvalue){
      this.speed+= speedupvalue;
        return speedupvalue;
    }
}

