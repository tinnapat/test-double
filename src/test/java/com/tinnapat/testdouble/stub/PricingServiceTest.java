package com.tinnapat.testdouble.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

class PricingServiceTest {

    @Test
    void calculate_price_100_net_price_should_107() {
        // set up
        RateProvider rateProvider = mock(RateProvider.class);
        PricingService pricingService = new PricingService(rateProvider);

        // given
        given(rateProvider.getRatePercent())
                .willReturn(7.0);

        // when
        double netPrice = pricingService.calculateNetPrice(100);

        // then
        assertEquals(107, netPrice);
    }
}