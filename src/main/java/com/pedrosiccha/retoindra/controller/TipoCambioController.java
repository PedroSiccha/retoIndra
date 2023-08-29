package com.pedrosiccha.retoindra.controller;

import com.pedrosiccha.retoindra.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/api/tipo-cambio")
    public ResponseEntity<TipoCambioResponse> aplicarTipoCambio(
            @RequestParam String monedaOrigen,
            @RequestParam String monedaDestino,
            @RequestParam double monto) {
        double factorCambio = tipoCambioService.obtenerFactorCambio(monedaOrigen, monedaDestino);
        double montoConvertido = monto * factorCambio;

        TipoCambioResponse response = new TipoCambioResponse(monto, montoConvertido, monedaOrigen, monedaDestino, factorCambio);
        return ResponseEntity.ok(response);
    }

    // Clase interna para representar la respuesta de la API
    private static class TipoCambioResponse {
        private final double monto;
        private final double montoConvertido;
        private final String monedaOrigen;
        private final String monedaDestino;
        private final double factorCambio;

        public TipoCambioResponse(double monto, double montoConvertido, String monedaOrigen, String monedaDestino, double factorCambio) {
            this.monto = monto;
            this.montoConvertido = montoConvertido;
            this.monedaOrigen = monedaOrigen;
            this.monedaDestino = monedaDestino;
            this.factorCambio = factorCambio;
        }

        // Getters
    }

}
