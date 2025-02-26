package com.example;

public class Client {
    private Service service;

    // Constructor injection
    public Client(Service service) {
        this.service = service;
    }

    public void doWork() {
        service.execute();
    }
}
