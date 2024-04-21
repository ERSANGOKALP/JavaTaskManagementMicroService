package com.ersandev.dto;

import com.ersandev.modal.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

    private Long id;

    private String title;

    private String description;

    private String image;

    private Long assignedUserId;

    private List<String> tags =new ArrayList<>();

    private TaskStatus status;

    private LocalDateTime deadline;

    private LocalDateTime createdAt;
}
