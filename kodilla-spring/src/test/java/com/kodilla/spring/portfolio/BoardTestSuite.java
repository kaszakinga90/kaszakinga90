package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDoTasks = "List of tasks to do";
        String tasksInProgress = "List of tasks in progress";
        String doneTasks = "List of done tasks";
        board.getToDoList().addTask(toDoTasks);
        board.getInProgressList().addTask(tasksInProgress);
        board.getDoneList().addTask(doneTasks);

        //Then
        Assert.assertEquals("List of tasks to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("List of tasks in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("List of done tasks", board.getDoneList().getTasks().get(0));
    }
}
