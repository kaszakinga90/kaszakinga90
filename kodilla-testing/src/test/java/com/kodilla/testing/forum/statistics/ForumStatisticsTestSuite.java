package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    /*
    stwórz zestaw testów, zawierający testy sprawdzające
    metodę calculateAdvStatistics(Statistics statistics) testowanej klasy.
    Testy zrealizuj przy pomocy mocka interfejsu Statistics.
    Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:
    gdy liczba postów = 0,
    gdy liczba postów = 1000,
    gdy liczba komentarzy = 0,
    gdy liczba komentarzy < liczba postów,
    gdy liczba komentarzy > liczba postów,
    gdy liczba użytkowników = 0,
    gdy liczba użytkowników = 100.
     */

    private static int testCounter = 0;
    private Statistics statisticsMock;
    private CalculateStatistics forumStatistics;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Before
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("forumUser");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(50);
        forumStatistics = new CalculateStatistics();
    }

    @Test
    public void shouldBeZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void shouldBeThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(100, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0.05, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void shouldBeZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getComments());
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void shouldBeLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(10, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(4, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(0.4, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void shouldBeMoreCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPosts());
        assertEquals(40, forumStatistics.getComments());
        assertEquals(1, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(4, forumStatistics.getCommentsPerUser(), 0.01);
        assertEquals(4, forumStatistics.getCommentsPerPost(), 0.01);
    }

    @Test
    public void shouldBeZeroUsers(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsers());
        assertEquals(0, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getCommentsPerUser(), 0.01);
    }

    @Test
    public void shouldBeHundredUsers(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("forumUser");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(0.4, forumStatistics.getPostsPerUser(), 0.01);
        assertEquals(0.5, forumStatistics.getCommentsPerUser(), 0.01);
    }
}
