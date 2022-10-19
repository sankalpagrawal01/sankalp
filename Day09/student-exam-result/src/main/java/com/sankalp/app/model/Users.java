package com.sankalp.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "rollNo")
    private String rollNo;
    @Column(name = "name")
    private String name;
    @Column(name = "school_name")
    private String schoolname;
    @Column(name = "science_marks")
    private Integer sciencemarks;
    @Column(name = "math_marks")
    private Integer mathmarks;
    @Column(name = "socialscience_marks")
    private Integer socialsciencemarks;
    @Column(name = "art_marks")
    private Integer artmarks;
    @Column(name = "sport_marks")
    private Integer sportmarks;

    public Users() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolname;
    }

    public void setSchoolName(String schoolname) {
        this.schoolname = schoolname;
    }

    public Integer getScienceMarks() {
        return sciencemarks;
    }

    public void setScienceMarks(Integer sciencemarks) {
        this.sciencemarks = sciencemarks;
    }

    public Integer getMathMarks() {
        return mathmarks;
    }

    public void setMathMarks(Integer mathmarks) {
        this.mathmarks = mathmarks;
    }

    public Integer getSocialscienceMarks() {
        return socialsciencemarks;
    }

    public void setSocialscienceMarks(Integer socialsciencemarks) {
        this.socialsciencemarks = socialsciencemarks;
    }

    public Integer getArtMarks() {
        return artmarks;
    }

    public void setArtMarks(Integer artmarks) {
        this.artmarks = artmarks;
    }

    public Integer getSportMarks() {
        return sportmarks;
    }

    public void setSportMarks(Integer sportmarks) {
        this.sportmarks = sportmarks;
    }
}
