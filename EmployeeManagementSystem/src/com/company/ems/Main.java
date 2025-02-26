package com.company.ems;

public class Main {

	public static void main(String[] args) {
		Company company = new Company();

        IManager manager = new Manager();
        manager.setName("MJ");
        manager.setID(1);

        IDeveloper developer = new Developer();
        developer.setName("AJ");
        developer.setID(2);

        ISecurityGuard securityGuard = new SecurityGuard();
        securityGuard.setName("GP");
        securityGuard.setID(3);

        company.addEmployee(manager);
        company.addEmployee(developer);
        company.addEmployee(securityGuard);

        company.showAllEmployees();
	}

}
