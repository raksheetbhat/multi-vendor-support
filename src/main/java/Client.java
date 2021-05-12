package main.java;

public class Client {
    public static void main(String[] args) {
        Vendor v = new Proxy("agora");
        v.generateToken();
        v.createSession();

        Vendor v1 = new Proxy("vonage");
        v1.generateToken();
        v1.createSession();
    }
}
