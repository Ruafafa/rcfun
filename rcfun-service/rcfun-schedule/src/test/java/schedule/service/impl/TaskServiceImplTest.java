package schedule.service.impl;

import jakarta.annotation.Resource;
import model.schedule.dtos.Task;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import schedule.ScheduleApplication;

import java.util.Date;

@SpringBootTest(classes = {ScheduleApplication.class})
class TaskServiceImplTest {

    @Resource
    private TaskServiceImpl taskService;

    @Test
    void addTask() {
        for (int i = 0; i < 5; i++) {
            Task task = new Task();
            task.setPriority(1);
            task.setTaskType(100 + i);
            task.setParameters("test".getBytes());
            task.setExecuteTime(new Date().getTime() + 500 * i);
            long taskId = taskService.addTask(task);
        }
    }

    @Test
    void cancelTask() {
    }

    @Test
    void poll() {
    }
}