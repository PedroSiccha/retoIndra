-- Crear tabla TipoCambio
CREATE TABLE TipoCambio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    moneda_origen VARCHAR(3) NOT NULL,
    moneda_destino VARCHAR(3) NOT NULL,
    factor_cambio DOUBLE NOT NULL
);

-- Insertar datos de ejemplo
INSERT INTO TipoCambio (moneda_origen, moneda_destino, factor_cambio)
VALUES ('USD', 'EUR', 0.85);

INSERT INTO TipoCambio (moneda_origen, moneda_destino, factor_cambio)
VALUES ('USD', 'JPY', 110.0);
