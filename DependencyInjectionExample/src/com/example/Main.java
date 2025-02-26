package com.example;

public class Main {
    public static void main(String[] args) {
        // Create the service instance
        Service service = new ServiceImpl();

        // Inject the service instance into the client
        Client client = new Client(service);

        // Use the client
        client.doWork();
    }
}
