package cs5800.test.java;
import org.junit.Assert;
import org.junit.Test;


import cs5800.assignment1.utils.aggregation.Course;
import cs5800.assignment1.utils.aggregation.Instructor;
import cs5800.assignment1.utils.aggregation.Textbooks;

public class TestAggregation {
    public final Course course = new Course();
    public final Instructor instructor = new Instructor();
    public final Textbooks textbooks = new Textbooks();

    @Test
    public void testInstructor() {
        // Variable Setup
        final String firstName = "John";
        final String lastName = "Doe";
        final String officeNumber = "c2345";

        // Setup objects
        this.instructor.setInstructorFirstName(firstName);
        this.instructor.setInstructorLastName(lastName);
        this.instructor.setOfficeNumber(officeNumber);

        // Start testing
        Assert.assertEquals(this.instructor.getInstructorFirstName(), firstName);
        Assert.assertEquals(this.instructor.getInstructorLastName(), lastName);
        Assert.assertEquals(this.instructor.getOfficeNumber(), officeNumber);
    }

    @Test
    public void testTextbook() {
        // Variable Setup
        final String title = "Adventures in Coding";
        final String author = "Jane Doe";
        final String publisher = "CPP Publishing Press";

        // Setup objects
        this.textbooks.setTitle(title);
        this.textbooks.setAuthor(author);
        this.textbooks.setPublisher(publisher);

        // Start testing
        Assert.assertEquals(this.textbooks.getTitle(), title);
        Assert.assertEquals(this.textbooks.getAuthor(), author);
        Assert.assertEquals(this.textbooks.getPublisher(), publisher);
    }

    @Test
    public void testCourse() {
        // Variable Setup
        final String courseName = "Intro to Computer Science";
        final String firstName = "John";
        final String lastName = "Doe";
        final String officeNumber = "c2345";
        final String title = "Adventures in Coding";
        final String author = "Jane Doe";
        final String publisher = "CPP Publishing Press";

        // Setup objects
        this.instructor.setInstructorFirstName(firstName);
        this.instructor.setInstructorLastName(lastName);
        this.instructor.setOfficeNumber(officeNumber);

        this.textbooks.setTitle(title);
        this.textbooks.setAuthor(author);
        this.textbooks.setPublisher(publisher);

        this.course.setName(courseName);
        this.course.setInstructor(this.instructor);
        this.course.setTextbooks(this.textbooks);

        // Start testing
        Assert.assertEquals(this.course.getName(), courseName);

        // Test instructor object in the course object
        Instructor assertedInstructor = this.course.getInstructor(0);
        Assert.assertEquals(assertedInstructor.getInstructorFirstName(), firstName);
        Assert.assertEquals(assertedInstructor.getInstructorLastName(), lastName);
        Assert.assertEquals(assertedInstructor.getOfficeNumber(), officeNumber);

        // Test textbook object in the course object
        Textbooks assertedTextbook = this.course.getTextbooks(0);
        Assert.assertEquals(assertedTextbook.getTitle(), title);
        Assert.assertEquals(assertedTextbook.getAuthor(), author);
        Assert.assertEquals(assertedTextbook.getPublisher(), publisher);
    }
}
