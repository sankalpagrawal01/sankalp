package com.sankalp.app;

import org.springframework.stereotype.Component;

@Component
public class Student {
    String name;
    String rollNo;
    String schoolName;
    Integer scienceMarks;
    Integer mathMarks;
    Integer socialScienceMarks;
    Integer artMarks;
    Integer sportMarks;

    public Student(String name,String rollNo,String schoolName,Integer scienceMarks,Integer mathMarks,Integer socialScienceMarks,Integer artMarks,Integer sportMarks){
        this.name=name;
        this.rollNo=rollNo;
        this.schoolName=schoolName;
        this.scienceMarks=scienceMarks;
        this.mathMarks=mathMarks;
        this.socialScienceMarks=socialScienceMarks;
        this.artMarks=artMarks;
        this.sportMarks=sportMarks;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(Integer scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public Integer getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(Integer mathMarks) {
        this.mathMarks = mathMarks;
    }

    public Integer getSocialScienceMarks() {
        return socialScienceMarks;
    }

    public void setSocialScienceMarks(Integer socialScienceMarks) {
        this.socialScienceMarks = socialScienceMarks;
    }

    public Integer getArtMarks() {
        return artMarks;
    }

    public void setArtMarks(Integer artMarks) {
        this.artMarks = artMarks;
    }

    public Integer getSportMarks() {
        return sportMarks;
    }

    public void setSportMarks(Integer sportMarks) {
        this.sportMarks = sportMarks;
    }
}
