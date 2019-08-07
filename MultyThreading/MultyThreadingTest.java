package nali.MultyThreading;

public class MultyThreadingTest {
    public static void main(String[] args) {
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
          Thread myThread3 = new Thread(new Runner());
          myThread3.start();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My thread " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My thread " + i);
        }
    }
}
