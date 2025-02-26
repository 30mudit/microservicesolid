package com.company.ems;

public class Manager extends Employee implements IManager {
    @Override
    public void manage() {
        System.out.println("Managing the team...");
    }

    @Override
    public void work() {
        manage();
    }
}
