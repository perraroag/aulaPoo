/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bo;

/**
 *
 * @author aluno
 */
public class ItemVenda {
    private int id;
    private float qtdproduto;
    private float valorunitario;
    private char status;
    
    private Movimentacaoestoque movimentacaoEstoque;

    public ItemVenda() {
    }

    public ItemVenda(int id, float qtdproduto, float valorunitario, char status, Movimentacaoestoque movimentacaoEstoque) {
        this.id = id;
        this.qtdproduto = qtdproduto;
        this.valorunitario = valorunitario;
        this.status = status;
        this.movimentacaoEstoque = movimentacaoEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdproduto() {
        return qtdproduto;
    }

    public void setQtdproduto(float qtdproduto) {
        this.qtdproduto = qtdproduto;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Movimentacaoestoque getMovimentacaoEstoque() {
        return movimentacaoEstoque;
    }

    public void setMovimentacaoEstoque(Movimentacaoestoque movimentacaoEstoque) {
        this.movimentacaoEstoque = movimentacaoEstoque;
    }


    @Override
    public String toString() {
        return "id=" + this.getId() + ", qtdproduto=" + this.getQtdproduto() + ", valorunitario=" + this.getValorunitario() + ", status=" + this.getStatus() + ", movimentacaoEstoque=" + this.getMovimentacaoEstoque() + '}';
    }
    
    
}
