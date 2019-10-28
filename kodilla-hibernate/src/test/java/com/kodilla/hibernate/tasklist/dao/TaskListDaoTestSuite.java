package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DONE = "Done list";
    private static final String DESCRIPTION = "List with done tasks";

    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(DONE, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(DONE);

        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals(DONE, readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);

    }
}
