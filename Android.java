package id.ac.unsyiah.apl.adapter;

public class Android implements Smartphone {
    @Override
    public void power(String on) {
        System.out.println(on);
    }

    @Override
    public void colorlight(String color) {
        System.out.println(color);
    }
}
