package ProjectPhone;

public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Hp Xiaomi dinyalakan");
    }

    @Override
    public void powerOff() {
        isPowerOn =false;
        System.out.println("Hp Xiaomi dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < max_volume){
            volume++;
            System.out.println("Volume dinaikan menjadi : "+volume);
        }else {
            System.out.println("Hp mati");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > min_volume){
            volume--;
            System.out.println("Volume diturunkan menjadi : "+volume);
        }else {
            System.out.println("Hp mati");
        }
    }

    public int getVolume(){
        System.out.println("Volume saat ini : "+volume);
        return volume;
    }
}

