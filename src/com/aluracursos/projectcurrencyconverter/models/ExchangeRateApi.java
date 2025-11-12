package com.aluracursos.projectcurrencyconverter.models;

public record ExchangeRateApi(String baseCode, String targetCode, Double conversionRate, String timeLastUpdate) {
}
