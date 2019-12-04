package com.essencedigital.talend.component.amazon;

import com.essencedigital.common.AbstractTalendComponent;
import com.essencedigital.common.ConvertibleToObject;
import com.essencedigital.common.result.ReportStatus;

import java.util.List;

public class AmazonSBReportComponent extends AbstractTalendComponent {

    public AmazonSBReportComponent(final String logLevel) {
        super(logLevel);
    }

    public byte[] getReport(final byte[] parameters) {
//        AmazonPa twitterAdsAnalyticsParameters = ConvertibleToObject.convertFromBytes(byteParameters);
//        log.debug("Input params: {}", twitterAdsAnalyticsParameters);
//        ReportStatus result;
//        try {
//            setAnalytics(new TwitterAdsAnalytics(new TwitterAdsBase(twitterAdsAnalyticsParameters)));
//            List<TwitterEntityStatisticsChapter> analyticsData = getAnalytics().getData();
//            if(analyticsData.isEmpty()) {
//                log.trace("Analytics data is empty");
//                result = ReportStatus.success(EMPTY_REPORT);
//            } else {
//                log.trace("Analytics data size: {}", analyticsData.size());
//                // Save it
//                List<String> fileNames = saveResults(
//                    getAnalytics().getCsvData(analyticsData),
//                    twitterAdsAnalyticsParameters.getBasePath(),
//                    twitterAdsAnalyticsParameters.getFilePrefix() + "_" + twitterAdsAnalyticsParameters.getEntityType().toLowerCase()
//                );
//                result = fileNames.size() > 0? ReportStatus.success(fileNames): ReportStatus.success(EMPTY_REPORT);
//            }
//        } catch(Exception e) {
//            log.trace("Exception", e);
//            result = ReportStatus.failure(e);
//        }
//
//        return result.convertToBytes();
        return null;
    }
}
