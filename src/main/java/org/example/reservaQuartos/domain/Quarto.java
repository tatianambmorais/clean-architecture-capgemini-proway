package org.example.reservaQuartos.domain;

public class Quarto {
    private Long numero;
    private String tipo;
    private boolean statusOcupado; // true = ocupado, false = disponível

    public Quarto(Long numero, String tipo, boolean status){
        this.numero = numero;
        this.tipo = tipo;
        this.statusOcupado = status;
    }

    public Long getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isStatusOcupado() {
        return statusOcupado;
    }

    public void setStatusOcupado(boolean statusOcupado) {
        this.statusOcupado = statusOcupado;
    }
}
