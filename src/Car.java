public class Car extends Vehicle{

    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

   // @Override
   // public void setSpeed(int speed) {
       // super.setSpeed(speed);
 //   }

   // @Override
   // public int getSpeed() {
    //    return super.getSpeed();
  //  }

  //  @Override
   // public int speedUp() {
    //    return super.speedUp();
   // }

    @Override
    public int speedUp(int speedupvalue) {
        super.speedUp(speedupvalue);
        System.out.println("new spped of car:"+getSpeed());
        return speedUp();
    }
}
