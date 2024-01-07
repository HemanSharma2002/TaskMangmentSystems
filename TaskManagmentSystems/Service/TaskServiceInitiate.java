package com.Task.TaskManagmentSystems.Service;

import com.Task.TaskManagmentSystems.Entity.Task;
import com.Task.TaskManagmentSystems.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceInitiate implements TaskService{


    @Autowired
    private TaskRepository taskRepository;
    //Save Functions
    @Override
    public void SaveTask(Task task) {
        taskRepository.save(task);
    }

    //Read Functions
    @Override
    public List<Task> fetchTaskList() {
        return taskRepository.findAll();
    }
    @Override
    public Task findBys_no( Long s_no) {
        return taskRepository.findById(s_no).get();
    }

    //Delete Functions
    @Override
    public void DeleteAllData() {
        taskRepository.deleteAll();
    }
    @Override
    public void DeleteDataBySno(Long s_no) {
        taskRepository.deleteById(s_no);
    }

    //Update Functions
    @Override
    public void updatestatus( Long id) {
        Task task=taskRepository.findById(id).get();
        task.setStatus(true);
        taskRepository.save(task);
        // update status will also delete the task as it is done
        taskRepository.deleteById(id);
    }
    @Override
    public void updatetask(Long id, Task newtask) {
        Task task =taskRepository.findById(id).get();
        if(!newtask.getTitle().equalsIgnoreCase(task.getTitle()) && !newtask.getTitle().isEmpty()){
            task.setTitle(newtask.getTitle());
        }
        if(!newtask.getDescription().equalsIgnoreCase(task.getDescription()) && !newtask.getDescription().isEmpty()){
            task.setDescription(newtask.getDescription());
        }
        if(newtask.getDeadline()!=null && !newtask.getDeadline().equals(task.getDeadline()))
        {
            task.setDeadline(newtask.getDeadline());
        }
        taskRepository.save(task);
    }
}

