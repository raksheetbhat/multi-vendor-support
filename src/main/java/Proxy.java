package main.java;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements Vendor {

    private static final Map<String, Vendor> vendorMap = new HashMap<>();
    private final String type;

    static {
        vendorMap.put("agora", new Agora());
        vendorMap.put("vonage", new Vonage());
        vendorMap.put("tokbox", new Tokbox());
    }

    public Proxy(String type) {
        this.type = type;
    }

    @Override
    public void generateToken() {
        vendorMap.get(type).generateToken();
    }

    @Override
    public void createSession() {
        vendorMap.get(type).createSession();
    }
}
