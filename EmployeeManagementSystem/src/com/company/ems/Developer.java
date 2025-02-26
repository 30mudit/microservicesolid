
package com.company.ems;

public class Developer extends Employee implements IDeveloper {
    @Override
    public void code() {
        System.out.println("Writing code...");
    }

    @Override
    public void work() {
        code();
    }
}
