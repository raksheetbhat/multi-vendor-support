package main.java;

public class Tokbox implements Vendor {
    @Override
    public void generateToken() {
        System.out.println("tokbox generates token");
    }

    @Override
    public void createSession() {
        System.out.println("tokbox create session");
    }
}
