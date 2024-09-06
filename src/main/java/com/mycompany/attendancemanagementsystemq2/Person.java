/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.attendancemanagementsystemq2;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RC_Student_lab
 */
abstract class Person {
        private String name;
    private Map<String, Boolean> attendanceRecords;

    public Person(String name) {
        this.name = name;
        this.attendanceRecords = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void markAttendance(String date, boolean present) {
        attendanceRecords.put(date, present);
    }

    public Map<String, Boolean> getAttendanceRecords() {
        return attendanceRecords;
    }

    @Override
    public String toString() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getType();

 
}


