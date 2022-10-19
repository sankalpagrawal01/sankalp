package com.sankalp.app.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class CreateControllerTest {
    @InjectMocks
    private CreateController createController;
    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void saveCustomerTest() {
        Customer mockCustomer = mock(Customer.class);
        Customer expectedCustomer = new Customer("pres1", "101", "get some medicine", "patient1", "Doc1");
        when(customerRepository.save(any(Customer.class))).thenReturn(expectedCustomer);
        Customer result = createController.saveCustomer(mockCustomer);
        Assert.assertEquals(result.getPrescriptionId(), expectedCustomer.getPrescriptionId());
        Assert.assertEquals(result.getAppointmentId(), expectedCustomer.getAppointmentId());
        Assert.assertEquals(result.getDescription(), expectedCustomer.getDescription());
        Assert.assertEquals(result.getPatientName(), expectedCustomer.getPatientName());
        Assert.assertEquals(result.getDoctorName(), expectedCustomer.getDoctorName());

    }

    @Test
    public void readCustomerTest() {
        List<Customer> customers= new ArrayList();
        Customer expectedCustomer = new Customer("pres1", "101", "get some medicine", "patient1", "Doc1");
        customers.add(expectedCustomer);
        when(customerRepository.findAll()).thenReturn(customers);
        List<Customer> result = createController.readCustomer();
        Assert.assertEquals(result.get(0).getPrescriptionId(), expectedCustomer.getPrescriptionId());
        Assert.assertEquals(result.get(0).getAppointmentId(), expectedCustomer.getAppointmentId());
        Assert.assertEquals(result.get(0).getDescription(), expectedCustomer.getDescription());
        Assert.assertEquals(result.get(0).getPatientName(), expectedCustomer.getPatientName());
        Assert.assertEquals(result.get(0).getDoctorName(), expectedCustomer.getDoctorName());

    }

    @Test
    public void modifyByPatientNameTest() {
        Customer expectedCustomer = new Customer("pres1", "101", "get some medicine", "patient1", "Doc1");
        when(customerRepository.findByPatientName(anyString())).thenReturn(expectedCustomer);
        createController.modifyByPatientName("Doc2", "patient1");
        verify(customerRepository, times(1)).save(expectedCustomer);
    }

    @Test
    public void deleteByPatientNameTest() {
        String patientName= "patient1";
        createController.deleteByPatientName(patientName);
        verify(customerRepository, times(1)).deleteByPatientName(patientName);
    }
}
