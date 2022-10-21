import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;

    public Points(){
        this.points = new ArrayList<>();
    }

    public void add(int value){
        if(value>=0 && value<=100){
            this.points.add(value);
        }
    }

    public double average(){
        int sum = 0;
        for(Integer point : this.points){
            sum += point;
        }
        return 1.0*sum/this.points.size();
    }

    public String averagePassing(){
        int sum = 0;
        int counter = 0;
        for(Integer point : this.points){
            if(point>=50){
                sum += point;
                counter++;
            }
        }
        if(counter==0){
            return "-";
        }
        return +1.0*sum/counter+"";
    }
    public double passPercentage(){
        int passing = 0;
        int participants = this.points.size();
        for(Integer point : points){
            if(point>=50){
                passing++;
            }
        }
        return 100.0*passing/participants;
    }
    public void gradeDistribution(){
        int[] grades = {0, 0, 0, 0, 0, 0};
        for(Integer point : points){
            if(point>=90){
                grades[5]++;
            } else if(point<90 && point>=80){
                grades[4]++;
            } else if(point<80 && point>=70){
                grades[3]++;
            } else if(point<70 && point>=60){
                grades[2]++;
            } else if(point<60 && point>=50){
                grades[1]++;
            } else if(point<50){
                grades[0]++;
            }
        }
        int index = 0;
        for(int grade : grades){
            System.out.print(index+": ");
            for(int i=0; i<grade; i++){
                System.out.print("*");
            }
            index++;
            System.out.println("");
        }
    }

}
