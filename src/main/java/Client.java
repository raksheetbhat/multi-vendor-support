package main.java;

public class Client {
    public static void main(String[] args) {
        Vendor v = new Proxy("agora");
        v.generateToken();
        v.createSession();

        Vendor v1 = new Proxy("vonage");
        v1.generateToken();
        v1.createSession();

        Vendor v2 = new Proxy("tokbox");
        v2.generateToken();
        v2.createSession();
    }
}
