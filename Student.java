import java.util.ArrayList;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String adress;
    public ArrayList<Double> grades = new ArrayList<Double>();

    public double CalculateTheAverageGrade() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("There is no grades");
        }
        double sum = 0;
        for (double value : grades) {
            sum += value;
        }
        double average = sum / grades.size();
        double[] roundingList = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double minDifference = Double.MAX_VALUE;
        double closestValue = average;
        for (double value : roundingList) {
            double difference = Math.abs(value - average);
            if (difference < minDifference) {
                minDifference = difference;
                closestValue = value;
            }
        }
        return closestValue;

    }
}
