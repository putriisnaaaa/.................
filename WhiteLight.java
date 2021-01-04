public class WhiteLight implements Light {
    private String redup;

    public void power(String on) {
        System.out.println(on);
    }

    public void aturKecerahan(String redup) {
        this.redup = redup;
        System.out.println(redup);
    }

    public String getcolor() {
        return "White";
    }

    public String getkecerahan() {
        return redup;
    }
}