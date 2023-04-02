package org.reportingapi.service;


import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.MalformedURLException;

public interface ReportingApiService {
    String reportingApiInfo(String username, String password, String acceptLanguage, String clearanceType) throws JsonProcessingException, MalformedURLException;
}
