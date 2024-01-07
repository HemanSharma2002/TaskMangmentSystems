package com.Task.TaskManagmentSystems.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sNo;
    @NotEmpty(message = "Title must not be empty")
    private String title;
    @NotEmpty(message = "Description  must not be empty")
    private String Description;
    @NotNull(message = "Deadline  must not be null")
    private Date deadline;
    private boolean Status ;
}