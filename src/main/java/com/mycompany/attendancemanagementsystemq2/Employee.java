/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.attendancemanagementsystemq2;

/**
 *
 * @author RC_Student_lab
 */

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Employee";
    }
} 

