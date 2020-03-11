package javaConcepts.advanced.threads;

import java.util.concurrent.Exchanger;

public class ExchangerDemo2 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(new ProdConAlphabets(exchanger)).start();
        new Thread(new ProdConNumerics(exchanger)).start();
    }
}

class ProdConAlphabets implements Runnable {

    Exchanger<String> ex;
    String str;

    public ProdConAlphabets(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        char ch = 'A';

        for (char i = 0; i < 3; i++) {
            str = new String();
            for (int j = 0; j < 5; j++)
                str += ch++;
            try {
                //Exchange a full buffer for an empty one
                str = ex.exchange(str);
                System.out.println("ProdConAlphabets : " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class ProdConNumerics implements Runnable {

    Exchanger<String> ex;
    String str;

    public ProdConNumerics(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        int num = 1;

        for (int i = 0; i < 3; i++) {
            str = new String();
            for (int j = 0; j < 5; j++)
                str += num++;
            try {
                //Exchange a full buffer for an empty one
                str = ex.exchange(str);
                System.out.println("ProdConNumerics : " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}