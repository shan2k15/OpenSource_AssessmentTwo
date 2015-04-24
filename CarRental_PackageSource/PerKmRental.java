package CarRental_PackageSource;


/**
 *
 * @author Shannon 
 */

public class PerKmRental 
{
    private double rental = 1;
    private double revenue = 0;
    
    public PerKmRental(double kilometres)
    {
        this.revenue = this.rental * kilometres;
    }
    
    public double getRevenue()
    {
        return this.revenue;
    }
    
    public double getRental()
    {
        return rental;
    }
    
    public void setRental(double rental)
    {
        this.rental = rental;
    }
}
        
        
        
       
        
        
        
        

	     





