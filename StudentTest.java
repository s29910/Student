import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @org.junit.jupiter.api.Test
    void calculateTheAverageGradeTest() {
        // arrange
        Student s1 = new Student();
        s1.fname = "Pasha";
        s1.lname = "Smit";
        s1.indexNumber = "s27868";
        s1.email = "s27868@pjwstk.edu.pl";
        s1.adress = "Grzybowska 9";
        s1.grades.add(5.0);
        s1.grades.add(4.0);
        s1.grades.add(4.0);
        // act
        double result = s1.CalculateTheAverageGrade();
        // assert
        assertEquals(4.5, result);
    }

}