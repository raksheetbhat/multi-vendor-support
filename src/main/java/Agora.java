package main.java;

public class Agora implements Vendor {
    @Override
    public void generateToken() {
        System.out.println("agora generated token");
    }
    @Override
    public void createSession() {
        System.out.println("agora creates session");
    }
}
