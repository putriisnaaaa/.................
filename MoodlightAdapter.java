package id.ac.unsyiah.apl.adapter;

public class MoodlightAdapter implements Smartphone {

    Saklar saklar; //relasi composite atau has-a

    public MoodlightAdapter(Saklar saklar) {
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
