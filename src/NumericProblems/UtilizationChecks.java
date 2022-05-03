package NumericProblems;
/*
A risk modeling system uses a scaling computing system that implements an autoscale policy
depending on the current load or utilization of the computing system.
The system starts with a number of computing instances given by instances.
The system polls the instances every second to see the average utilization at that second,
and performs scaling as described below. Once any action is taken, the system will stop polling for 10 seconds.
During that time, the number of instances does not change.
Average utilization > 60%: Double the number of instances if the doubled value does not exceed 2 * 10^8.
This is an action. If the number of instances exceeds this limit on doubling, perform no action.
Average utilization < 25%: Halve the number of instances if the number of instances is greater than 1
(take ceil if the number is not an integer). This is also an action. If the number of instances is 1, take no action.
25% <= Average utilization <= 60%: No action.
Given an array of the values of the average utilization at each second for this system,
determine the number of instances at the end of the time frame.
For example, the system starts with instances = 2, and
average utilization is given as averageUtil = [25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80].
At the first second, utilization is 25, so no action is taken.
At the second second, averageUtil[1] = 23 < 25, so instances = 2 / 2 = 1. The next 10 seconds,
averageUtil[2]..averageUtil[11], no polling is done.
At averageUtil[11] = 76, 76 > 60 so the number of instances is doubled.
There are no more readings to consider and 2 is the final answer.

 */
public class UtilizationChecks {
    public static int utilizationChecks(int instances, int[] avgArr){

        for(int i=0; i<avgArr.length; i++){
            if(avgArr[i]<25 && i>1){
                instances = (int) Math.ceil(instances/2.0);
                i+=10;
            }else if(i< avgArr.length && avgArr[i]>60 && i<200000000){
                instances = instances*2;
                i+=10;

            }else{
                continue;
            }
        }
        return instances;
    }
    public static void main(String[] args){
         int[] nums = {25, 23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 80};
         System.out.println(utilizationChecks(2, nums));
    }
}
