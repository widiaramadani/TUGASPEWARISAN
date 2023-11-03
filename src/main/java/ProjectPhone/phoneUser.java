package ProjectPhone;


public class phoneUser implements Phone{
    private Phone phone;

    public phoneUser(Phone phone){
        this.phone= phone;
    }
    public void turnOnThePhone(){
        phone.powerOn();
    }
    public void turnOffThePhone(){
        phone.powerOff();
    }
    public void makePhoneLouder(){
        phone.volumeUp();
    }
    public void makePhoneSilent(){
        phone.volumeDown();
    }

    @Override
    public void powerOn() {
        turnOnThePhone();
    }

    @Override
    public void powerOff() {
        turnOffThePhone();
    }

    @Override
    public void volumeUp() {
        makePhoneLouder();
    }

    @Override
    public void volumeDown() {
        makePhoneSilent();
    }
}
