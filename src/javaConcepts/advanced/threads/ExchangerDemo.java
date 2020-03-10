package javaConcepts.advanced.threads;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new MakeString(exchanger)).start();
        new Thread(new UseString(exchanger)).start();
    }
}

class MakeString implements Runnable {

    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        this.str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++)
                str += ch++;
            try {
                //Exchange a full buffer for an empty one
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class UseString implements Runnable {

    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                //Exchange an empty buffer for a full one
                str = ex.exchange(new String());
                System.out.println("Got : " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}