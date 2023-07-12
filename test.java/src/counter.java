
    class counter2 {
        int count;

        public synchronized void increment() {
            count++;

        }
    }


        public class counter {
            public static void main(String[] args) throws InterruptedException {
                counter2 ct = new counter2();

                Runnable ct1 = () -> {

                    for (int k = 0; k <= 1000; k++) {
                        ct.increment();
                    }
                };
                Runnable ct2 = () -> {
                    for (int h = 0; h <= 1000; h++){

                        ct.increment();
                    }
                };

                Thread t1 = new Thread(ct1);
                Thread t2 = new Thread(ct2);
                t1.start();
                t2.start();

                t1.join();
                t2.join();
                System.out.println(ct.count);
            }

        }

