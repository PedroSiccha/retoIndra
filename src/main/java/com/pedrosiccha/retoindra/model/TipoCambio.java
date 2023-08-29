package com.pedrosiccha.retoindra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String monedaOrigen;
    private String monedaDestino;
    private double factorCambio;

    // Constructores, getters y setters

    public TipoCambio() {
    }

    public TipoCambio(String monedaOrigen, String monedaDestino, double factorCambio) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.factorCambio = factorCambio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getFactorCambio() {
        return factorCambio;
    }

    public void setFactorCambio(double factorCambio) {
        this.factorCambio = factorCambio;
    }
}
