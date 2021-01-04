package id.ac.unsyiah.apl.adapter;

public class SaklarAdapter implements Saklar {

    Saklar saklar; //relasi composite atau has-a

    public SaklarAdapter(Saklar saklar) {
        this.saklar = saklar;
    }

    @Override
    public void power() {
        saklar.power();
    }

    @Override
    public void colorlight() {
        saklar.colorlight();
    }
}
