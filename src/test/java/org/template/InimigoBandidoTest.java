package org.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InimigoBandidoTest {
    @Test
    void deveRetonarBandido() {
        InimigoBandido bandido = new InimigoBandido();
        bandido.setVidaBase(1000.0f);
        bandido.setPorcentagem(1.0f);
        assertEquals("Bandido", bandido.verificarTipo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        InimigoBandido bandido = new InimigoBandido();
        bandido.setVidaBase(1000.0f);
        bandido.setPorcentagem(0.0f);
        assertEquals("Tipo de inimigo não identificado", bandido.verificarTipo());
    }

    @Test
    void deveRetornarInformacoes() {
        InimigoBandido bandido = new InimigoBandido();
        bandido.setVidaBase(1000.0f);
        bandido.setPorcentagem(1.0f);
        bandido.setNome("Bandido da Gangue dos Trapalhões");
        bandido.setCodigo(1);
        assertEquals("InimigoBandido{código=1, nome='Bandido da Gangue dos Trapalhões', tipo=Bandido}", bandido.getInfo());
    }

}