package com.aluracursos.projectcurrencyconverter.models;

import com.aluracursos.projectcurrencyconverter.API.ExchangeApiClient;

import java.io.IOException;

public class ExchangeRate {
    private String baseCode = "";
    private String targetCode = "";
    private double conversionRate = 0.0;
    private String timeLastUpdate = "";
    private double mount = 0.0;

    public ExchangeRate(String baseCode, String targetCode, Double mount) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.mount = mount;
    }

    public ExchangeRate(ExchangeRateApi myExchangeRate) {
        this.baseCode = myExchangeRate.baseCode();
        this.targetCode = myExchangeRate.targetCode();
        this.conversionRate = myExchangeRate.conversionRate();
        this.timeLastUpdate = myExchangeRate.timeLastUpdate();
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public String getTimeLastUpdate() {
        return timeLastUpdate;
    }

    public void showExchangeRate() throws IOException, InterruptedException {
        ExchangeApiClient myExchangeApiClient = new ExchangeApiClient();
        Object[] result = myExchangeApiClient.CheckRate(this.baseCode, this.targetCode);
        this.conversionRate = (double) result[0] * mount;
        this.timeLastUpdate = result[1].toString();
        System.out.println("$" + this.mount + " " + this.baseCode + " = $" + this.conversionRate + " " + this.targetCode + " (de acuerdo al tipo de cambio correspondiente al " + this.timeLastUpdate + ")");
    }
}
