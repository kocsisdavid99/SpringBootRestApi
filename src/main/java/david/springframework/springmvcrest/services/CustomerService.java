package david.springframework.springmvcrest.services;

import david.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
