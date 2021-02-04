package com.eceron.jobsearch.api;

import com.eceron.jobsearch.JobPosition;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

/**
 * Esta interfaz sera usada por Feign para hacer las peticiones a la API de github.
 */
@Headers("Accept: application/json")
public interface APIJobs {
    @RequestLine("GET /positions.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);

    @RequestLine("GET /positions/{id}.json")
    JobPosition job(@Param("id") String id);
}
