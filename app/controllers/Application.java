package controllers;

import models.Task;
import play.*;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

@Transactional
public class Application extends Controller {

    public static Result index() {
        Task task = new Task();
        task.setTaskTitle("test task");
        JPA.em().persist(task);

        task = JPA.em().find(Task.class, task.getId());

        return ok(Json.toJson(task));
    }

}
