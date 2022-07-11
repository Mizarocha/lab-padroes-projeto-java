package one.digitalinnovation.gof.Strategy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
