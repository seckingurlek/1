public class MotorBike extends Vehicle {
    private String motorName;

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }


  //  @Override
   // public int speedUp() {
    //    super.speedUp();
    //    return 0;
 // }

   // @Override
   // public void setSpeed(int speed) {
     //  super.setSpeed(speed);
   // }


    @Override
    public int speedUp(int speedupvalue) {

        super.speedUp(speedupvalue );

        System.out.println("new speed of motorbike:"+getSpeed());

        return speedUp();
    }
    }


