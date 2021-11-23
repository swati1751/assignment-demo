package assignment6;

public class LazyInitializationThreadSafe {
    static class HospitalOperation {
        private static HospitalOperation _instance;
        private static HospitalOperation
                _instanceForDoubleCheckLocking;
        private boolean empty = false;
        private String patientName = "default";
        private HospitalOperation()
        {
            System.out.println("Instance Created");
        }
        public static synchronized HospitalOperation
        getInstanceSynchronizedWay()
        {

            if (_instance == null)
                _instance = new HospitalOperation();

            return _instance;
        }

        public static HospitalOperation
        getInstanceSynchronizedBlockWay()
        {
            if (_instanceForDoubleCheckLocking == null)
                synchronized (HospitalOperation.class)
                {
                    if (_instanceForDoubleCheckLocking == null)
                        _instanceForDoubleCheckLocking
                                = new HospitalOperation();
                }

            return _instanceForDoubleCheckLocking;
        }
        public boolean isOperationTheatreEmpty()
        {
            return empty;
        }
        public void endOperation() { empty = true; }
        public synchronized void operation(String aName)
        {
            if (empty == true) {
                patientName = aName;
                System.out.println("Operation can be done "
                        + "get ready patient "
                        + patientName);
                empty = false;
            }
            else {
                System.out.println(
                        "Sorry " + aName
                                + " Operation Theatre is busy with Surgery of "
                                + patientName);
            }
        }
    }
    public class Hospital {
        public static void main(String args[])
        {
            Thread t1 = new Thread(new Runnable() {
                public void run()
                {
                    HospitalOperation i1
                            = HospitalOperation
                            .getInstanceSynchronizedWay();

                    System.out.println(
                            "The instance 1 in Synchronized Method is "
                                    + i1);
                    i1.endOperation();
                    i1.operation("123");
                }
            });
            Thread t2 = new Thread(new Runnable() {
                public void run()
                {

                    HospitalOperation i2
                            = HospitalOperation
                            .getInstanceSynchronizedWay();

                    System.out.println(
                            "The instance 2 in Synchronized Method is "
                                    + i2);
                    i2.operation("789");
                }
            });
            t1.start();
            t2.start();

            System.out.println(
                    "Double Checked locking - Synchronized Block only");

            Thread t3 = new Thread(new Runnable(){
                public void run()
                {
                    HospitalOperation i1
                            = HospitalOperation
                            .getInstanceSynchronizedBlockWay();

                    System.out.println(
                            "The instance 1 in Double Checked Locking way is "
                                    + i1);

                    i1.endOperation();
                    i1.operation("ABC");
                }
            });
            Thread t4 = new Thread(new Runnable() {
                public void run()
                {
                    HospitalOperation i2
                            = HospitalOperation
                            .getInstanceSynchronizedBlockWay();

                    System.out.println(
                            "The instance 2 in Double Checked Locking way is "
                                    + i2);
                    i2.operation("XYZ");
                }
            });
            t3.start();
            t4.start();
        }
    }

}
