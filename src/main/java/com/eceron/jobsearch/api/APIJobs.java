package com.eceron.jobsearch.api;

import com.eceron.jobsearch.JobPositions;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIJobs {

    @RequestLine("GET /positions.json")
    List<JobPositions> jobs(@QueryMap Map<String, Object> queryMap);
}
