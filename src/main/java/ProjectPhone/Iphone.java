package ProjectPhone;
    public class Iphone implements Phone{
        private int volume;
        private boolean isPowerOn;

        public Iphone() {
            this.volume = 50;
            this.isPowerOn = false;
        }

        @Override
        public void powerOn() {
            isPowerOn = true;
            System.out.println("Hp Iphone dinyalakan");
        }

        @Override
        public void powerOff() {
            isPowerOn =false;
            System.out.println("Hp Iphone dimatikan");
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

