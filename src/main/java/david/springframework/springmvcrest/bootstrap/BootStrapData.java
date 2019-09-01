package david.springframework.springmvcrest.bootstrap;

import david.springframework.springmvcrest.domain.Customer;
import david.springframework.springmvcrest.respositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Dávid");
        c1.setLastname("Kocsis");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Elek");
        c2.setLastname("Nagy");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Imre");
        c3.setLastname("Kiss");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());

    }
}
