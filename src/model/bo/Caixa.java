
package model.bo;

public class Caixa {

    private int id;
    private String datahoraabertura;
    private String datahorafechamento;
    private float valorabertura;
    private float valorfechamento;
    private String observacao;
    private char status;
    private Movimentacaoestoque movimentoestoque;

    public Caixa() {
    }

    public Caixa(int id, String datahoraabertura, String datahorafechamento, float valorabertura, float valorfechamento, String observacao, char status, Movimentacaoestoque movimentoestoque) {
        this.id = id;
        this.datahoraabertura = datahoraabertura;
        this.datahorafechamento = datahorafechamento;
        this.valorabertura = valorabertura;
        this.valorfechamento = valorfechamento;
        this.observacao = observacao;
        this.status = status;
        this.movimentoestoque = movimentoestoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatahoraabertura() {
        return datahoraabertura;
    }

    public void setDatahoraabertura(String datahoraabertura) {
        this.datahoraabertura = datahoraabertura;
    }

    public String getDatahorafechamento() {
        return datahorafechamento;
    }

    public void setDatahorafechamento(String datahorafechamento) {
        this.datahorafechamento = datahorafechamento;
    }

    public float getValorabertura() {
        return valorabertura;
    }

    public void setValorabertura(float valorabertura) {
        this.valorabertura = valorabertura;
    }

    public float getValorfechamento() {
        return valorfechamento;
    }

    public void setValorfechamento(float valorfechamento) {
        this.valorfechamento = valorfechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Movimentacaoestoque getMovimentoestoque() {
        return movimentoestoque;
    }

    public void setMovimentoestoque(Movimentacaoestoque movimentoestoque) {
        this.movimentoestoque = movimentoestoque;
    }

    @Override
    public String toString() {
        return "Caixa{" + "id=" + this.getId() + ", datahoraabertura=" + this.getDatahoraabertura() + ", datahorafechamento=" + this.getDatahorafechamento() + ", valorabertura=" + this.getValorabertura() + ", valorfechamento=" + this.getValorfechamento() + ", observacao=" + this.getObservacao() + ", status=" + this.getStatus() + ", movimentoestoque=" + this.movimentoestoque.getId();
    }
    
    
    
}
