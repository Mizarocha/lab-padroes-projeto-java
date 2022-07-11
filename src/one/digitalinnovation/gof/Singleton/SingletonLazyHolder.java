package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author Mizarocha
 */

public class SingletonLazyHolder {

    private  static class IntanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return IntanceHolder.instancia;
    }
}




