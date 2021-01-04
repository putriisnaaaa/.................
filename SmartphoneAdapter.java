package id.ac.unsyiah.apl.adapter;

public class SmartphoneAdapter implements Smartphone {

    Smartphone smartphone; //relasi composite atau has-a

    public SmartphoneAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public void power() {
        smartphone.power();
    }

    @Override
    public void colorlight() {
        smartphone.colorlight();
    }
}
