import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @org.junit.jupiter.api.Test
    void assignSubjectTeacherTest() {
        // arrange
        Teacher t1 = new Teacher();
        t1.fname = "Anna";
        t1.lname = "Smith";
        t1.email = "s87943870@pjwstk.edu.pl";

        //act
        Subject s1 = new Subject();
        s1.name = "Math";
        s1.type = "lecture";
        s1.rate = 10;
        t1.assignSubject(s1);
        //assert
        assertEquals(1, t1.subjects.size());


    }

    @org.junit.jupiter.api.Test
    void CalculateSalaryTest() {
        // arrange
        Teacher t1 = new Teacher();
        t1.fname = "Anna";
        t1.lname = "Smith";
        t1.email = "s87943870@pjwstk.edu.pl";
        Subject s1 = new Subject();
        s1.name = "Math";
        s1.type = "lecture";
        s1.rate = 10;
        t1.assignSubject(s1);

        //act
        float result = t1.CalculateTeacherSalary();

        //assert
        assertEquals(180, result);

    }
}


