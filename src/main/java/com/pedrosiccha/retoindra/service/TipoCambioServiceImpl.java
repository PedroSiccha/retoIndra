package com.pedrosiccha.retoindra.service;

import com.pedrosiccha.retoindra.exception.TipoCambioNotFoundException;
import com.pedrosiccha.retoindra.model.TipoCambio;
import com.pedrosiccha.retoindra.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {
    @Autowired
    private TipoCambioRepository tipoCambioRepository;

    @Override
    public double obtenerFactorCambio(String monedaOrigen, String monedaDestino) {
        System.out.println("obtenerFactorCambio: " + monedaOrigen);
        TipoCambio tipoCambio = tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
        if (tipoCambio == null) {
            throw new TipoCambioNotFoundException("Tipo de cambio no encontrado");
        }
        return tipoCambio.getFactorCambio();
    }
}
