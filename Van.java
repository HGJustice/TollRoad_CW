
package tollroadmain;


public class Van extends Vehicle {
    
    private int payLoad;
    
    public Van(String registrationPlate,String vehicleMenufacturer,int payLoad){
        super(registrationPlate,vehicleMenufacturer);
        this.payLoad = payLoad;
    }
    
    @Override
    public int calculateBasicTripCost(){
        
        int cost = 0;
        if(payLoad <= 600)
        {
            cost = 500;
            return cost;
        } 
        else if (payLoad > 600 && payLoad <=800)
        {
            cost = 750;
            return cost;
        }
        else if (payLoad > 800)
        {
            cost = 1000;
            return cost;
        }
        
        return cost;
    }
    
    public int getPayLoad(){
        return payLoad;
    }
    
}
