package com.essencedigital.talend.component.parameters;

import com.essencedigital.common.ConvertibleToBytes;
import com.essencedigital.common.ConvertibleToObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class AmazonParametersBase implements ConvertibleToObject, ConvertibleToBytes {
    public static final int DEFAULT_TIMEOUT = 3600;

    private String accessToken, refreshToken, clientId, profileId,
        outputBaseDir, outputFilePrefix, recordType;
    private LocalDateTime reportDate;
    private int timeout;
}
