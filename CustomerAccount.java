
package tollroadmain;


public class CustomerAccount implements Comparable<CustomerAccount>  {

   
    
    public enum discountType{None,Staff,friendsAndFamily}
    
    private String firstName;
    private String lastName;
    Vehicle vehicle;
    private int currentAccountBalance;
    private discountType discount;
    
    
    public CustomerAccount(String firstName, String lastName, Vehicle vehicle
                                                   ,int currentAccountBalance) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicle = vehicle;
        this.currentAccountBalance = currentAccountBalance;
        
    }
    
    
    public void activateStaffDiscount(){
        discount = discount.Staff;
    }
    
    public void activateFriendsAndFamilyDiscount(){
        discount = discount.friendsAndFamily;
    }
    
    public void deactivateDiscount(){
        discount = discount.None;
    }
    
    public void addFunds(int amount){
        currentAccountBalance+=amount;
    }
    
    public void makeTrip(){
         
    }
    
     @Override
    public int compareTo(CustomerAccount account) {
       
        
        return 0;
       
    }
    
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName; 
    }
    
    public Vehicle getVehicle(){
        return vehicle;
    }
    
    public int getCurrentAccountBalance(){
        return currentAccountBalance;
    }
    
}
