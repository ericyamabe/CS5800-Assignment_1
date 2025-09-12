package cs5800.assignment1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cs5800.assignment1.utils.aggregation.Course;
import cs5800.assignment1.utils.aggregation.Instructor;
import cs5800.assignment1.utils.aggregation.Textbooks;

public class TestAggregation {
    public final Course course = new Course();
    public final Instructor instructor = new Instructor();
    public final Textbooks textbooks = new Textbooks();

    @Test
    void testInstructor() {
        // Variable Setup
        final String firstName = "John";
        final String lastName = "Doe";
        final String officeNumber = "c2345";

        // Setup objects
        this.instructor.setInstructorFirstName(firstName);
        this.instructor.setInstructorLastName(lastName);
        this.instructor.setOfficeNumber(officeNumber);

        // Start testing
        assertEquals(this.instructor.getInstructorFirstName(), firstName);
        assertEquals(this.instructor.getInstructorLastName(), lastName);
        assertEquals(this.instructor.getOfficeNumber(), officeNumber);
    }

    @Test
    void testTextbook() {
        // Variable Setup
        final String title = "Adventures in Coding";
        final String author = "Jane Doe";
        final String publisher = "CPP Publishing Press";

        // Setup objects
        this.textbooks.setTitle(title);
        this.textbooks.setAuthor(author);
        this.textbooks.setPublisher(publisher);

        // Start testing
        assertEquals(this.textbooks.getTitle(), title);
        assertEquals(this.textbooks.getAuthor(), author);
        assertEquals(this.textbooks.getPublisher(), publisher);
    }

    @Test
    void testCourse() {
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
        assertEquals(this.course.getName(), courseName);

        // Test instructor object in the course object
        Instructor assertedInstructor = this.course.getInstructor(0);
        assertEquals(assertedInstructor.getInstructorFirstName(), firstName);
        assertEquals(assertedInstructor.getInstructorLastName(), lastName);
        assertEquals(assertedInstructor.getOfficeNumber(), officeNumber);

        // Test textbook object in the course object
        Textbooks assertedTextbook = this.course.getTextbooks(0);
        assertEquals(assertedTextbook.getTitle(), title);
        assertEquals(assertedTextbook.getAuthor(), author);
        assertEquals(assertedTextbook.getPublisher(), publisher);
    }
}
