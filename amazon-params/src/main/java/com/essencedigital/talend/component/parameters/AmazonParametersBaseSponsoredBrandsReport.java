package com.essencedigital.talend.component.parameters;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
public class AmazonParametersBaseSponsoredBrandsReport extends AmazonParametersBase {
    private Set<String> metricsFields;

    public AmazonParametersBaseSponsoredBrandsReport(
        final String accessToken, final String refreshToken, final String clientId, final String profileId,
        final String outputBaseDir, final String outputFilePrefix,
        final String recordType, final LocalDateTime reportDate,
        final int timeout,
        final Set<String> metricsFields
    ) {
        super(
            accessToken, refreshToken, clientId, profileId,
            outputBaseDir, outputFilePrefix,
            recordType, reportDate,
            timeout
        );
        this.metricsFields = metricsFields;
    }
}
