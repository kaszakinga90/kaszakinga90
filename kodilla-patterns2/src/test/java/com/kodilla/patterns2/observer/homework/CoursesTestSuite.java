package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoursesTestSuite {

    @Test
    public void testUpdateTasks(){
        //Given
        Student student1 = new Student("Sarah Miles", Courses.WebDeveloper);
        Student student2 = new Student("Francis Cane", Courses.JavaDeveloperPlus);
        Student student3 = new Student("Michael Brown", Courses.JavaDeveloperPlus);
        Student student4 = new Student("Jessica Bird", Courses.WebDeveloper);
        Student student5 = new Student("Noah Stock", Courses.WebDeveloperPlus);
        Student student6 = new Student("Patric Edelstein", Courses.WebDeveloper);
        Student student7 = new Student("Robert Wisdom", Courses.React);
        Student student8 = new Student("Blake House", Courses.JavaDeveloper);
        Student student9 = new Student("John Doom", Courses.JavaDeveloper);
        Student student10 = new Student("Chester Stone", Courses.JavaDeveloper);

        Mentor mentor1 = new Mentor("Elon Musk");
        Mentor mentor2 = new Mentor("Bill Gates");
        Mentor mentor3 = new Mentor("Mark Zuckerberg");

        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student3.registerObserver(mentor3);
        student4.registerObserver(mentor3);
        student5.registerObserver(mentor2);
        student6.registerObserver(mentor1);
        student7.registerObserver(mentor2);
        student8.registerObserver(mentor2);
        student9.registerObserver(mentor1);
        student10.registerObserver(mentor3);

        //When
        student4.addTask("task1", "Name of task1");
        student2.addTask("task4", "Name of task4");
        student7.addTask("task6", "Name of task6");
        student9.addTask("task3", "Name of task3");
        student3.addTask("task9", "Name of task9");
        student3.addTask("task21", "Name of task21");
        student7.addTask("task17", "Name of task17");
        student7.addTask("task5", "Name of task5");

        //Then
        assertEquals(1, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
        assertEquals(3, mentor3.getUpdateCount());
    }


}
