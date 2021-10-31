
package ass22;


public class address {
     String street, city  ,cuntry;

    public address(String street, String city, String cuntry) 
    {
        this.street = street;
        this.city = city;
        this.cuntry = cuntry; 
}

    @Override
    public String toString() {
        return "{ "  + street+" "+ city +" "+ cuntry + '}';
    }
    
}