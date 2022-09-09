import java.util.ArrayList;
import java.util.List;

public class TrainProblem {

    public List<Integer> arrival;
    public List<Integer> depature;
public int count;
    public TrainProblem(){
        arrival = new ArrayList<>();
        depature = new ArrayList<>();
        count = 0;
    }

    public int returnnoofPlatforms(List<Integer> arrival, List<Integer> depature){
    int platforms = 1;
count = 0;
        for(int i = 1 ; i<arrival.size(); i++){

            for(int j=0; j<=i;j++){

                if(arrival.get(i)<depature.get(j)){
                    count++;
                }



            }
            System.out.println("The platformS: "+platforms);
                   if(count>platforms){
                       platforms = count;

                   }

                   count =0;
        }



        return platforms;
    }


    public static void main(String args[])
    {


    }
}
