package org.template;

public class InimigoEsqueleto extends Inimigo{
    public String verificarTipo() {
        if (this.calcularVida() == 2000f) {
            return "Esqueleto";
        }
        else {
            return "Tipo de inimigo não identificado";
        }
    }
    @Override
    public String getTipo() {
        return "InimigoEsqueleto";
    }
}
