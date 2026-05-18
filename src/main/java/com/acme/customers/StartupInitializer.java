package com.acme.customers;

import java.time.LocalDateTime;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class StartupInitializer {

    @Inject
    CustomerService service;

    public void onStartup(@Observes @Initialized(ApplicationScoped.class) Object event) {
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer();
            customer.setId(i);
            customer.setFirstName("Test" + i);
            customer.setLastName("Customer" + i);
            customer.setCreatedAt(LocalDateTime.now().minusDays(30));
            service.saveCustomer(customer);
        }
    }
}