package com.example.backend.jobs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final JobsService jobsService;

    public JobsController(JobsService jobsService){
        this.jobsService=jobsService;
    }

    @GetMapping("/all")
    public List<Job> listAllJobs(){
        return jobsService.getAllJobs();
    }
}
