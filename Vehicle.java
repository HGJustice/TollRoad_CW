
package tollroadmain;


public abstract class Vehicle {
    
    protected String registrationPlate;
    protected String vehicleMenufacturer;
    
    
    public Vehicle(String registrationPlate,String vehicleMenufacturer){
        
        this.registrationPlate = registrationPlate;
        this.vehicleMenufacturer = vehicleMenufacturer;
    }
    
    public abstract int calculateBasicTripCost();
        
    
    public String getRegistrationPlate(){
        return registrationPlate;
    }
    
    
    public String getVehicleMenufacturer(){
        return vehicleMenufacturer;
    }
    
    
    
    
}
