package com.Task.TaskManagmentSystems.Service;

import com.Task.TaskManagmentSystems.Entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    void  SaveTask(Task task);

    List<Task> fetchTaskList();

    void DeleteAllData();

    void updatestatus(Long id);

    void DeleteDataBySno(Long id);

    Task findBys_no(Long s_no);

    void updatetask(Long id, Task newtask);
}
