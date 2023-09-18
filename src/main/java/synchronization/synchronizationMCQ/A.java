package synchronization.synchronizationMCQ;

public class A implements Runnable {

    Integer n;
    public boolean toggleFunc;

    public A(Integer n) { this.n = n; }

    synchronized void func1(Integer n) {
        System.out.println("Incrementing n by 10 in func1 used in thread " + Thread.currentThread().getName());
        for(int i=0; i<10; i++) n++;
    }

    synchronized void func2(Integer n) {
        System.out.println("Decrementing n by 10 in func2 used in thread " + Thread.currentThread().getName());
        for(int i=0; i<10; i++) n--;
    }

    void func3(Integer n) {
        System.out.println("n is " + n);
    }

    @Override
    public void run() {
        if(toggleFunc) {
            func1(n);
        }
        else {
            func2(n);
        }
        func3(n);
    }
}
