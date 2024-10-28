package one.dio.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public  static final SingletonLazyHolder instace = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static synchronized SingletonLazyHolder getInstance() {
        
        return InstanceHolder.instace;

    }
}
