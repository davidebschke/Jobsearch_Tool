package com.example.backend.jobs;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class JobService {

    String apiUrl = "https://rest.arbeitsagentur.de/jobboerse/jobsuche-service/pc/v4/app/jobs";

    public List<Jobdetails> getAllJobs() {

        WebClient client = WebClient.create();

        return Objects.requireNonNull(Objects.requireNonNull(client.get()
                        .uri(apiUrl).
                        retrieve().
                        toEntityList(Jobdetails.class)
                        .block())
                .getBody());
    }
}
