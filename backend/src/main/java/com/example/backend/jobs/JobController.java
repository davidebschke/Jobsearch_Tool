package com.example.backend.jobs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobsService){
        this.jobService=jobsService;
    }

    @GetMapping
    public List<Job> listAllJobs(){
        return jobService.getAllJobs();
    }
}
