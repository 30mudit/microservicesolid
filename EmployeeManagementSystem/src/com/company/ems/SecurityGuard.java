package com.company.ems;

public class SecurityGuard extends Employee implements ISecurityGuard {
    @Override
    public void secure() {
        System.out.println("Securing the premises...");
    }

    @Override
    public void work() {
        secure();
    }
}
