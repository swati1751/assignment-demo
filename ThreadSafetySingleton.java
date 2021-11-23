package assignment6;

public class ThreadSafetySingleton {

        private static final ThreadSafetySingleton instance = new ThreadSafetySingleton();

        private ThreadSafetySingleton()
        {
        }
        public static ThreadSafetySingleton getInstance () {
        var instance1 = instance;
        return instance1;
    }
    }



