package ProjectPhone;

    import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) {
            Xiaomi x = new Xiaomi();
            Iphone i = new Iphone();
            Oppo O = new Oppo();
            Samsung s = new Samsung();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {

                System.out.println("Pilih ponsel yang akan diatur:");
                System.out.println("1. Xiaomi");
                System.out.println("2. iPhone");
                System.out.println("3. Oppo");
                System.out.println("4. Samsung");
                System.out.print("Masukkan nomor pilihan: ");

                int pilih = Integer.parseInt(br.readLine());

                Phone pilihHp = null;
                switch (pilih) {
                    case 1:
                        pilihHp = x;
                        x.powerOn();
                        x.volumeUp();
                        x.volumeDown();
                        x.volumeUp();
                        x.volumeDown();
                        x.getVolume();
                        x.powerOff();
                        break;
                    case 2:
                        pilihHp = i;
                        i.powerOn();
                        i.volumeUp();
                        i.volumeDown();
                        i.volumeDown();
                        i.getVolume();
                        i.powerOff();
                        break;
                    case 3:
                        pilihHp = O;
                        O.powerOn();
                        O.volumeUp();
                        O.volumeUp();
                        O.volumeDown();
                        O.volumeDown();
                        O.getVolume();
                        O.powerOff();
                        break;
                    case 4:
                        pilihHp = s;
                        s.powerOn();
                        s.volumeUp();
                        s.volumeDown();
                        s.volumeUp();
                        s.getVolume();
                        s.powerOff();
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
}
