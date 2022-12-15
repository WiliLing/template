package org.template;

public abstract class Inimigo {
    private int codigo;
    protected String nome;
    private float vidaBase;
    private float porcentagem;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
    public float calcularVida() {
        return (this.vidaBase * porcentagem);
    }

    public abstract String verificarTipo();

    public String getTipo() {
        return "Inimigo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "código=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", tipo=" + this.verificarTipo() +
                '}';
    }
}