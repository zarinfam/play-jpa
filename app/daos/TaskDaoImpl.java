package daos;

import models.Task;

import javax.inject.Named;


/**
 * Created by saeed on 1/March/15 AD.
 */

@Named
public class TaskDaoImpl extends GenericDaoImpl<Task, Long> implements TaskDao {

}