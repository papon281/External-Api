package org.reportingapi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.reportingapi.service.ReportingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;


@RestController
@RequestMapping("/reportingApi")

public class ReportingApiController {
    private final ReportingApiService reportingApiService;

    @Autowired
    public ReportingApiController(ReportingApiService reportingApiService) {
        this.reportingApiService = reportingApiService;
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Object> getReportingApiInfo(@RequestParam("username") String username,
                                                      @RequestParam("password") String password,
                                                      @RequestParam("language") String language,
                                                      @RequestParam("clearance") String clearance) throws JsonProcessingException, MalformedURLException {
        String result = reportingApiService.reportingApiInfo(username, password, language, clearance);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
