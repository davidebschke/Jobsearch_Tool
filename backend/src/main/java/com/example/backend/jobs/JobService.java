package com.example.backend.jobs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    public List<Job> getAllJobs() {

        List<Job> jobTest=new ArrayList<>();
        Job job1;
        job1=new Job("1","Maurer","Maurerunternehmen","Hello World");
        jobTest.add(0,job1);

        return jobTest;
    }
}
