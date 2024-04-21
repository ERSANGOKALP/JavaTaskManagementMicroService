package com.ersandev.service;

import com.ersandev.modal.Submission;

import java.util.List;

public interface SubmissionService {

    Submission submitTask(Long taskId,String githubLink,Long userId,String jwt) throws Exception;

    Submission getTaskSubmissionById(Long submissionId) throws Exception;

    List<Submission> getAllTaskSubmission();

    List<Submission> getTaskSubmissionsByTaskId(Long taskId);

    Submission exceptDeclineSubmission(Long id,String status)throws Exception;

}
