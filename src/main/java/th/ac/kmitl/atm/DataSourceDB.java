package th.ac.kmitl.atm;

//Peerada Posiri 61050865
import java.util.HashMap;
import java.util.Map;
public class DataSourceDB implements DataSource{


    public Map<Integer,Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1,new Customer(1,"Peerada",1234,1000));
        customers.put(2,new Customer(2,"Dear",2345,2000));
        customers.put(3,new Customer(3,"Nink",3456,3000));

        return customers;
    }
}