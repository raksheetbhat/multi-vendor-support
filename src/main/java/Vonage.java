package main.java;

public class Vonage implements Vendor {
    @Override
    public void generateToken() {
        System.out.println("vonage generates token");
    }
    @Override
    public void createSession() {
        System.out.println("vonage creates session");
    }
}
