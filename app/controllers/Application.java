package controllers;

import models.Task;
import play.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;

import services.TaskService;
import views.html.*;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Application extends Controller {

    @Inject
    private TaskService taskService;

    public Result index() {
        Task task = new Task();
        task.setTaskTitle("test task");

        taskService.addTask(task);

        task = taskService.getTask(task.getId());

        return ok(Json.toJson(task));
    }

}
