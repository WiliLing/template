package org.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inimigoEsqueletoTest {
    @Test
    void deveRetonarEsqueleto() {
        InimigoEsqueleto esqueleto = new InimigoEsqueleto();
        esqueleto.setVidaBase(1000.0f);
        esqueleto.setPorcentagem(2.0f);
        assertEquals("Esqueleto", esqueleto.verificarTipo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        InimigoEsqueleto esqueleto = new InimigoEsqueleto();
        esqueleto.setVidaBase(1000.0f);
        esqueleto.setPorcentagem(0.0f);
        assertEquals("Tipo de inimigo não identificado", esqueleto.verificarTipo());
    }

    @Test
    void deveRetornarInformacoes() {
        InimigoEsqueleto esqueleto = new InimigoEsqueleto();
        esqueleto.setVidaBase(1000.0f);
        esqueleto.setPorcentagem(2.0f);
        esqueleto.setNome("Skelly O Esqueleto");
        esqueleto.setCodigo(3);
        assertEquals("InimigoEsqueleto{código=3, nome='Skelly O Esqueleto', tipo=Esqueleto}", esqueleto.getInfo());
    }

}