package org.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InimigoDragaoTest {
    @Test
    void deveRetonarDragao() {
        InimigoDragao dragao = new InimigoDragao();
        dragao.setVidaBase(1000.0f);
        dragao.setPorcentagem(10.0f);
        assertEquals("Dragão", dragao.verificarTipo());
    }

    @Test
    void deveRetonarNaoIdentificado() {
        InimigoDragao dragao = new InimigoDragao();
        dragao.setVidaBase(1000.0f);
        dragao.setPorcentagem(0.0f);
        assertEquals("Tipo de inimigo não identificado", dragao.verificarTipo());
    }

    @Test
    void deveRetornarInformacoes() {
        InimigoDragao dragao = new InimigoDragao();
        dragao.setVidaBase(1000.0f);
        dragao.setPorcentagem(10.0f);
        dragao.setNome("Dragão Branco de Olhos Azuis");
        dragao.setCodigo(2);
        assertEquals("InimigoDragao{código=2, nome='Dragão Branco de Olhos Azuis', tipo=Dragão}", dragao.getInfo());
    }

}