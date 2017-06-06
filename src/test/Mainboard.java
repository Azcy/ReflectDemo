package test;

/**
 * Created by zcy on 2017/6/4.
 */
public class Mainboard {
    public  void run()
    {
        System.out.println("main board run....");
    }
    public void usePCI(PCI p){
        if (p!=null){
            p.open();
            p.close();
        }
    }


}
