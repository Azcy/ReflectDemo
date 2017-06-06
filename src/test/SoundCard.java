package test;

/**
 * Created by zcy on 2017/6/4.
 */
public class SoundCard implements PCI {

    public SoundCard(){}
    @Override
    public void open() {
        System.out.println("soundcard open");
    }

    @Override
    public void close() {
        System.out.println("soundcard close");
    }
}
