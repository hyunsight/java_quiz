package ch15.quiz8;

import java.util.Set;

public class Student {
    public int studentNum;
    public String name;
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            return target.studentNum == studentNum;
        } else return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
