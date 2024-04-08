import static org.junit.jupiter.api.Assertions.*;

class StudentGroupTest {
    @org.junit.jupiter.api.Test
    void AddStudentToTheGroupTest() {
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

        StudentGroup group1 = new StudentGroup();
        group1.groupName = "14d";

        // act
        group1.addStudentToTheGroup(s1);

        // assert
        assertEquals(1, group1.students.size());

    }

    @org.junit.jupiter.api.Test
    void AddStudentToTheGroupTwiceTest() {
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

        StudentGroup group1 = new StudentGroup();
        group1.groupName = "14d";

        // act
        group1.addStudentToTheGroup(s1);
        // assert
        assertThrows(IllegalStateException.class, () ->
                group1.addStudentToTheGroup(s1), "Expected exception");
    }
}

