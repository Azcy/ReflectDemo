package test;

/**
 * Created by zcy on 2017/6/4.
 */
public class NetCard implements PCI {
    @Override
    public void open() {
        System.out.println("netCard open");
    }

    @Override
    public void close() {
        System.out.println("netCard close");
    }
}
