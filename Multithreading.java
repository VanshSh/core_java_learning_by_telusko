class Counter {

    int count = 0;

    public synchronized void increment() {
        count += 1;
    }
}
// class ThreadA extends Thread {
// class ThreadA implements Runnable {
// public void run() {
// for (int i = 1; i <= 6; i++) {
// System.out.println("In => A");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

// class ThreadB extends Thread {
class ThreadB implements Runnable {
    public void run() {
        for (int i = 1; i <= 6; i++) {
            // System.out.println("In ===> B");
            // try {
            // Thread.sleep(10);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {

        // ThreadA athread = new ThreadA();
        ThreadB bthread = new ThreadB();
        // bthread.setPriority(Thread.MAX_PRIORITY); // To set priority when creating
        // threads using the Thread Class
        // athread.start();
        // bthread.start();

        // Runnable obj1 = new ThreadA();

        Counter counter = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
                // System.out.println("In => A");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
            }
        };

        // Runnable obj2 = new ThreadB();
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();

                // System.out.println("In => B");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
