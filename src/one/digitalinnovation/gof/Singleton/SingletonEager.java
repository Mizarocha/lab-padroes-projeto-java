package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "apressado"
 *
 * @author Mizarocha
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

        private SingletonEager(){
            super();
        }
        public static SingletonEager getInstancia(){
            return instancia;
    }
        }
