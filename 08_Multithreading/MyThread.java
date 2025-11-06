class MyThread extends Thread {

    static int sum;

    public void run() {
        for (int i = 1; i <= 10; i++) {
            sum = sum + 10;
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        // t2.start(); // This line is commented out in your original code
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}