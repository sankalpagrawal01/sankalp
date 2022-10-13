package com.sankalp.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({StudentController.class})
@ActiveProfiles(value = "test")
public class StudentControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Value("${student.get.url}")
    String geturl;

    @Value("${student.get.all.url}")
    String getallurl;

    @Value("${student.post.url}")
    String posturl;

    @Value("${student.put.url}")
    String puturl;

    @Value("${student.delete.url}")
    String deleteurl;

    @Test
    public void testStudentGet() throws Exception {
        ResultActions responseEntity  = mockMvc.perform(get(geturl).param("name","stud1"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("", result);
    }

    @Test
    public void testStudentWithValueGet() throws Exception {
        Student student=new Student("stud1","roll1","xyz",70,71,72,73,74);
        mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));

        ResultActions responseEntity  = mockMvc.perform(get(geturl).param("name","stud1"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertNotNull(result);
    }
    @Test
    public void testAllStudentGet() throws Exception {
        ResultActions responseEntity  = mockMvc.perform(get(getallurl));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertNotNull(result);
    }


    @Test
    public void testSaveStudentPost() throws Exception {
        Student student=new Student("name1","roll1","xyz",70,71,72,73,74);
        ResultActions responseEntity  = mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));
        responseEntity.andExpect(status().isOk());

    }

    @Test
    public void testUpdateStudentPut() throws Exception {
        Student student=new Student("name1","roll1","xyz",70,71,72,73,74);
        mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));

        ResultActions responseEntity  = mockMvc.perform(put(puturl).param("name","name3")
                .param("schoolName","xyz2"));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertNotNull(result);

    }

    private String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
