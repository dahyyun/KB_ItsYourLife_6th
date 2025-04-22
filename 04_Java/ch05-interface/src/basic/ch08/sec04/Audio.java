package basic.ch08.sec04;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;

        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        }
        if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        }

        System.out.println("현재 Audio 볼륨: " + volume);
    }
}
