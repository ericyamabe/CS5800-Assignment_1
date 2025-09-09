public class Driver {
    public static void main(String[] args) {
        Instructor instructorNimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructorCyberProfessor = new Instructor("Cyber", "Professor", "1-1234");
        Textbooks textbookCleanCode = new Textbooks("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin", "Pearson");
        Textbooks textbookCyberResilience = new Textbooks("Cyber Resilience – Defence-in-depth principles", "Alan Calder", "IT Governance Publishing");
        Course course = new Course();
        course.setInstructor(instructorNimaDavarpanah);
        course.setTextbooks(textbookCleanCode);
        course.setInstructor(instructorCyberProfessor);
        course.setTextbooks(textbookCyberResilience);
        course.print();
    }
}