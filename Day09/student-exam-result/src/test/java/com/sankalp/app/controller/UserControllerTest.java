package com.sankalp.app.controller;

import com.sankalp.app.model.Users;
//import com.sankalp.app.repository.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class UserControllerTest {
    @InjectMocks
    private UsersController usersController;

    @Mock
    private UsersRepository usersRepository;

    @Test
    public void getAllTest(){
        Users user1=new Users();
        user1.setName("sam");
        user1.setRollNo("1234");
        user1.setSchoolName("school");
        user1.setScienceMarks(90);
        user1.setMathMarks(90);
        user1.setSocialscienceMarks(90);
        user1.setArtMarks(90);
        user1.setSportMarks(90);
        List<Users> usersList=new ArrayList<>();
        usersList.add(user1);
        when(usersRepository.findAll()).thenReturn(usersList);
        List<Users> results= (List<Users>) usersController.getAll();
        Users result =results.get(0);
        assertEquals("sam",result.getName());
        assertEquals("1234",result.getRollNo());
        assertEquals("school",result.getSchoolName());
        assertEquals(90,result.getScienceMarks());
        assertEquals(90,result.getMathMarks());
        assertEquals(90,result.getSocialscienceMarks());
        assertEquals(90,result.getArtMarks());
        assertEquals(90,result.getSportMarks());

    }

    @Test
    public void storeTest(){

    }
}
