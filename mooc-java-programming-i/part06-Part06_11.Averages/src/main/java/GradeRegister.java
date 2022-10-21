
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> list;

    public GradeRegister() {
        this.list = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.list.add(points);
    }

    public double averageOfPoints(){
        if(list.isEmpty()){
            return -1;
        }
        int sum = 0;
        double average = 0;
        for(int points : this.list){
            sum+=points;
        }
        return average = 1.0*sum/list.size();
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int sum = 0;
        double average = 0;
        for(Integer grade : this.grades){
            sum += grade;
        }
        return average = 1.0*sum/grades.size();
    }
}
