package basic.ch08.sec04;

import static basic.ch08.sec04.RemoteControl.MAX_VOLUME;
import static basic.ch08.sec04.RemoteControl.MIN_VOLUME;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
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

        System.out.println("현재 TV 볼륨: " + volume);
    }
}
