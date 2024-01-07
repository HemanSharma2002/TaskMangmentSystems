package com.Task.TaskManagmentSystems.Controler;

import com.Task.TaskManagmentSystems.Entity.Task;
import com.Task.TaskManagmentSystems.Service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskControler {
    @Autowired
    private TaskService taskService;

    //These are the post mapping
    @PreAuthorize("permitAll()")
    @PostMapping("/create")
    private String Create(@RequestBody @Valid Task task){
        taskService.SaveTask(task);

        return "SUCESS";
    }

    //These are the get mapping
    @GetMapping("/read/all")
    public List<Task> Read(){
        return taskService.fetchTaskList();
    }
    @GetMapping("/read/no/{Id}")
    public Task findBys_no(@PathVariable("Id") Long s_no){
        return taskService.findBys_no(s_no);
    }

    //These are the delete mapping
    @DeleteMapping("/delete/all")
    public String DeleteAll(){
        taskService.DeleteAllData();
        return "Data deleted sucessfully";
    }
    @DeleteMapping("/delete/{Id}")
    public String Delete(@PathVariable("Id") Long id){
        taskService.DeleteDataBySno(id);
        return "Data deleted sucessfully";
    }

    //These are the put mapping
    @PutMapping("/update/status/{Id}")
    public String updateStatus(@PathVariable("Id") Long id){
        taskService.updatestatus(id);
        return "Sucess";
    }
    @PutMapping("/update/{Id}")
    public String updateTask(@PathVariable("Id") Long id,@RequestBody Task task){
        taskService.updatetask(id,task);
        return "Sucess";
    }
}

