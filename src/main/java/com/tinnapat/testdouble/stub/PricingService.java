package com.tinnapat.testdouble.stub;

public class PricingService {

    private RateProvider rateProvider;

    public PricingService(RateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }

    public double calculateNetPrice(double priceBeforeTax) {
        return priceBeforeTax + (priceBeforeTax * rateProvider.getRatePercent() / 100);
    }
}
