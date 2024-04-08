import java.util.ArrayList;

public class Teacher {
    public String fname;
    public String lname;
    public String email;
    public ArrayList<Subject> subjects = new ArrayList<>();

    public void assignSubject(Subject subjectToAdd) {
        if (subjects.size() == 30) {
            throw new IllegalStateException("Maximum subjects is reached");
        }
        subjects.add(subjectToAdd);
    }

    public float CalculateTeacherSalary() {
        float amount = 0;
        for (int i = 0; i < subjects.size(); i++) {
            float amountForParticularSubject = subjects.get(i).rate * 15;
            if (subjects.get(i).type == "lecture") {
                amountForParticularSubject *= 1.2f;
            }
            amount += amountForParticularSubject;
        }
        return amount;
    }

}
