package classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController<TaskRepository> {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


//    @GetMapping
//    public List<Task> getAllTasks() {
//        return taskRepository.findAll();
//    }
//
//    @PostMapping
//    public Task createTask(@RequestBody Task task) {
//        return taskRepository.save(task);
//    }







}
