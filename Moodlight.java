import java.util.Scanner;

public class Moodlight {
    private Scanner sc = new Scanner(System.in);
    private String Nama;
    private String Username;
    private String Email;
    private String Password;
    private Light light;

    private static Moodlight uniqueInstance;

    private Moodlight() {}

    public static Moodlight getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Moodlight();
        }
        return uniqueInstance;
    }

    public void Display() {
        System.out.println("1. mengganti warna lampu");
        System.out.println("2. mengatur kecerahan lampu");
        int pilihan = sc.nextInt();

        if(pilihan==1){
            pilihanWarna();
        }
        else if(pilihan==2){
            sc.nextLine();
            String kecerahan = sc.nextLine();
            light.aturKecerahan(kecerahan);
        }
        else if(pilihan==3){
           System.out.println("exit");
        }
            System.out.println("Warna Lampu "+light.getcolor()+ " dengan kecerahan lampunya "+light.getkecerahan());
    }
   
    public void pilihanWarna() {
        System.out.println("1. White");
        System.out.println("2. Warm");
        System.out.println("3. Blue");
        System.out.println("4. Purple");
        System.out.println("5. Red");
        int pilihan = sc.nextInt();

        if(pilihan==1){
            light = new WhiteLight();
        }
        else if(pilihan==2){
            light = new WarmLight();
        }
        else if(pilihan==3){
            light = new BlueLight();
        }
        else if(pilihan==4){
            light = new PurpleLight();
        }
        else if(pilihan==5){
            light = new RedLight();
        }
        System.out.println("yeayy anda sukses berhasil mengubah lampu menjadi warna "+light.getcolor());
        Display();
    }

    

   public void Daftar(){
       System.out.println("Daftar");
       System.out.print("Nama: ");
       Nama = sc.nextLine();
       System.out.print("Username: ");
       Username = sc.nextLine();
       System.out.print("Email: ");
       Email = sc.nextLine();
       System.out.print("Password: ");
       Password = sc.nextLine();
   }

 public void Login(){
       System.out.println("Login");
       System.out.print("Username: ");
       Username = sc.nextLine();
       System.out.print("Password: ");
       Password = sc.nextLine();

       Display();
    
   }

}



