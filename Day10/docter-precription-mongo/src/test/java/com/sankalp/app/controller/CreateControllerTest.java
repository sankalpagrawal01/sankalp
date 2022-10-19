package com.sankalp.app.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

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
    private PrecriptionRepository precriptionRepository;

    @Test
    public void saveCustomerTest() {
        Precription mockCustomer = mock(Precription.class);
        Precription expectedPrecription = new Precription("pres123", "123", "blood test","pat1","doc1");
        when(precriptionRepository.save(any(Precription.class))).thenReturn(expectedPrecription);
        Precription result = createController.savePrecription(mockCustomer);
        Assert.assertEquals(result.getPrescriptionId(), expectedPrecription.getPrescriptionId());
        Assert.assertEquals(result.getAppointmentId(), expectedPrecription.getAppointmentId());
        Assert.assertEquals(result.getDescription(), expectedPrecription.getDescription());
        Assert.assertEquals(result.getPatientName(), expectedPrecription.getPatientName());
        Assert.assertEquals(result.getDoctorName(), expectedPrecription.getDoctorName());

    }

    @Test
    public void readCustomerTest() {
        List<Precription> precriptions= new ArrayList();
        Precription expectedCustomer = new Precription("pres123", "123", "blood test","pat1","doc1");
        precriptions.add(expectedCustomer);
        when(precriptionRepository.findAll()).thenReturn(precriptions);
        List<Precription> result = createController.readPrecription();
        Assert.assertEquals(result.get(0).getPrescriptionId(), expectedCustomer.getPrescriptionId());
        Assert.assertEquals(result.get(0).getAppointmentId(), expectedCustomer.getAppointmentId());
        Assert.assertEquals(result.get(0).getDescription(), expectedCustomer.getDescription());
        Assert.assertEquals(result.get(0).getPatientName(), expectedCustomer.getPatientName());
        Assert.assertEquals(result.get(0).getDoctorName(), expectedCustomer.getDoctorName());

    }

    @Test
    public void modifyByIDTest() {
        Precription expectedPrecription = new Precription("pres123", "123", "blood test","pat1","doc1");
        when(precriptionRepository.findByName(anyString())).thenReturn(expectedPrecription);
        createController.modifyByID("prs123","pate1");
        verify(precriptionRepository, times(1)).save(expectedPrecription);
    }

    @Test
    public void deleteyByIDTest() {
        String patientName= "custname";
        createController.deleteByID(patientName);
        verify(precriptionRepository, times(1)).deleteByID(patientName);
    }
}
