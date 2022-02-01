import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRunner {
    Customers customer;

    @Test(priority = 0, description = "Customer log in")
    public void doLogin() throws IOException, ConfigurationException {
        customer = new Customers();
        customer.callingCustomerLoginAPI();
    }

    @Test(priority = 1, description = "Customer list display")
    public void getCustomerList() throws IOException {
        customer = new Customers();
        customer.callingCustomerListAPI();
    }

    @Test(priority = 2, description = "Searching a customer by id")
    public void customerSearch() throws IOException {
        customer = new Customers();
        customer.searchCustomer();
    }

    @Test(priority = 3, description = "Updating a customer information")
    public void customerUpdate() throws IOException {
        customer = new Customers();
        customer.updateCustomer();
    }

    @Test(priority = 4, description = "Generating random customer from https://randomuser.me")
    public void customerGenerate() throws ConfigurationException, IOException {
        customer = new Customers();
        customer.generateCustomer();
    }

    @Test(priority = 5, description = "Adding the random generated customer to the existing customer list")
    public void customerCreate() throws IOException {
        customer = new Customers();
        customer.createCustomer();
    }

    @Test(priority = 6, description = "Deleting a customer")
    public void customerDelete() throws IOException {
        customer = new Customers();
        customer.deleteCustomer();
    }
}
