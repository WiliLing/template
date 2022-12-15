package org.template;

public class InimigoDragao extends Inimigo{
    public String verificarTipo() {
        if (this.calcularVida() == 10000f) {
            return "Dragão";
        }
        else {
            return "Tipo de inimigo não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "InimigoDragao";
    }
}
