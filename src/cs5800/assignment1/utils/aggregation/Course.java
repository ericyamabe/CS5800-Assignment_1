package cs5800.assignment1.utils.aggregation;
import cs5800.assignment1.utils.aggregation.Instructor;
import cs5800.assignment1.utils.aggregation.Textbooks;

public class Course {
    private String name;
    private Instructor[] instructors = new Instructor[2];
    private Textbooks[] textbooks = new Textbooks[2];
    private int instructorIndex;
    private int textbookIndex;

    public Course() {
        this.setName("");
        this.setTextbookIndex(0);
        this.setInstructorIndex(0);
    }

    public Course(String name) {
        this.setName(name);
        this.setTextbookIndex(0);
        this.setInstructorIndex(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setInstructor(Instructor instructor) {
        int currentIndex = this.getInstructorIndex();
        int nextIndex = currentIndex + 1;
        if(currentIndex < 2) {
            this.instructors[currentIndex] = instructor;
            this.setInstructorIndex(nextIndex);
        } else {
            System.out.println("Cannot add anymore Instructors");
        }
    }

    public Instructor getInstructor(int index) {
        return this.instructors[index];
    }

    public void setTextbooks(Textbooks textbooks) {
        int currentIndex = this.getTextbookIndex();
        int nextIndex = currentIndex + 1;
        if(currentIndex < 2) {
            this.textbooks[currentIndex] = textbooks;
            this.setTextbookIndex(nextIndex);
        } else {
            System.out.println("  ");
        }
    }

    public Textbooks getTextbooks(int index) {
        return this.textbooks[index];
    }

    private void setInstructorIndex(int index) {
        this.instructorIndex = index;
    }

    private int getInstructorIndex() {
        return this.instructorIndex;
    }

    private void setTextbookIndex(int index) {
        this.textbookIndex = index;
    }

    private int getTextbookIndex() {
        return this.textbookIndex;
    }

    public void print() {
        String courseName = this.getName();

        for(int i = 0; i < 2; i++) {
            Instructor instructor = this.getInstructor(i);
            Textbooks textbooks = this.getTextbooks(i);
            String instructorName = instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName();
            String instructorOfficeNumber = instructor.getOfficeNumber();
            String textbookTitle = textbooks.getTitle();
            String textbookPublisher = textbooks.getPublisher();

            System.out.println("Instructor: " + instructorName + " office " + instructorOfficeNumber + ", " + textbookTitle + ", " + textbookPublisher);
        }
    }
}
