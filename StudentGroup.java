import java.util.ArrayList;

public class StudentGroup {
    public String groupName;
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudentToTheGroup(Student studentToAdd) {
        if (students.size() == 15) {
            throw new IllegalStateException("Group is already full");
        }
        for (Student value : students) {
            if (value.indexNumber == studentToAdd.indexNumber) {
                throw new IllegalStateException("This student already exist in this group!");

            }
        }
        students.add(studentToAdd);

    }
}
