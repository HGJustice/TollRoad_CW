
package tollroadmain;


public class Truck extends Vehicle {
    
    private int numTrailers;
    
    public Truck(String registrationPlate,String vehicleMenufacturer,
                                                     int numTrailers)
    {
        super(registrationPlate,vehicleMenufacturer);
        this.numTrailers = numTrailers;
    }
    
    @Override
    public int calculateBasicTripCost() {
       
        int cost = 0;
        if(numTrailers == 1)
        {
            cost = 1250;
            return cost;
        }
        else if(numTrailers > 1)
        {
            cost = 1500;
            return cost;
        }
        
        return cost;
  
    }
    
    
    
    
    
}
