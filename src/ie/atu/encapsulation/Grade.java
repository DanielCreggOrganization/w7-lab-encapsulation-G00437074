package ie.atu.encapsulation;

public class Grade {
    // Private fields
    private String studentName;
    private int numericGrade;
    private String courseCode;

    // Constructor
    public Grade(String studentName, int numericGrade, String courseCode) {
        setStudentName(studentName);  // Uses validation in the setter
        setNumericGrade(numericGrade);  // Uses validation in the setter
        setCourseCode(courseCode);  // Uses validation in the setter
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getNumericGrade() {
        return numericGrade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    // Setter methods with validation
    public void setStudentName(String studentName) {
        validateStudentName(studentName);
        this.studentName = studentName;
    }

    public void setNumericGrade(int numericGrade) {
        validateGrade(numericGrade);
        this.numericGrade = numericGrade;
    }

    public void setCourseCode(String courseCode) {
        validateCourseCode(courseCode);
        this.courseCode = courseCode;
    }

    // Validation methods
    private void validateStudentName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }
    }

    private void validateGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    private void validateCourseCode(String code) {
        if (code == null || !code.matches("^[A-Za-z]{2}\\d{3}$")) {
            throw new IllegalArgumentException("Course code must match the pattern (e.g., 'CS101').");
        }
    }

    // Method to get the letter grade
    public char getLetterGrade() {
        if (numericGrade >= 90) {
            return 'A';
        } else if (numericGrade >= 80) {
            return 'B';
        } else if (numericGrade >= 70) {
            return 'C';
        } else if (numericGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}