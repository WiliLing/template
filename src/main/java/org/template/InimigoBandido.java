package org.template;

public class InimigoBandido extends Inimigo {
    public String verificarTipo() {
        if (this.calcularVida() == 1000f) {
            return "Bandido";
        }
        else {
            return "Tipo de inimigo não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "InimigoBandido";
    }
}
