package com.sankalp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class AppControllerTest {

    @InjectMocks
    AppController appController;

    MyController myController;

    @BeforeEach
    void setUp() {
        myController = mock(MyController.class);
        appController = new AppController(myController);
    }

    @Test
    public void addStringTest() {
        when(myController.sayHello()).thenReturn("Hello Sankalp :) ");
        String result = appController.sayHello();
        assertEquals("Hello Sankalp :) ", result);
    }
}
