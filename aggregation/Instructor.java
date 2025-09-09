public class Instructor {
    protected String instructorFirstName;
    protected String instructorLastName;
    protected String officeNumber;

    public Instructor() {
        this.setInstructorFirstName("");
        this.setInstructorLastName("");
        this.setOfficeNumber("");
    }

    public Instructor(String instructorFirstName, String instructorLastName, String officeNumber) {
        this.setInstructorFirstName(instructorFirstName);
        this.setInstructorLastName(instructorLastName);
        this.setOfficeNumber(officeNumber);
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorFirstName() {
        return this.instructorFirstName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String getInstructorLastName() {
        return this.instructorLastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return this.officeNumber;
    }
}