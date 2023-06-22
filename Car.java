
package tollroadmain;


public class Car extends Vehicle {
    
    private int numberOfSeats;
    
   public Car(String registrationPlate,String vehicleMenufacturer
                                               ,int numberOfSeats)
   
   {
       super(registrationPlate,vehicleMenufacturer);
       this.numberOfSeats = numberOfSeats;
   }
    
    @Override
   public int calculateBasicTripCost(){
       
       int cost=0;
       
       if(this.numberOfSeats <= 5){
          cost = 500; 
       }
       else 
          cost = 600;
       
       return cost;
   }
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    
    
}


