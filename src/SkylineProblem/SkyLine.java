package SkylineProblem;

import java.util.*;



public class SkyLine {

/*

	    1.First part of the problem:

	    2.break {x1,x2,y} => {x1,y},{x2,y}

	    3.Sort them on the basis of different conditions

		3.1 X1=X1 => bigger height point first o.y-this.y

		3.2 X2==X2 =>  lower height point first => this.y-o.y | this.isLeft = False

		3.3 X1 == X2 bigger height point first => this.y-o.y



	     4.Add to queue if point is left one

	     5.Remove from queue if point is right one

             6.Get current height from the queue

	     7.Get previous height from the variable (in starting 0

	     8.If there is  a difference -> skyline point -> (x,currheight in queue)

	     9. Update previousHeight = current height

	 *

	 */



    public static class XYPoint implements Comparable<XYPoint>{

        int x;

        int y;

        boolean isLeft;



        @Override

        public int compareTo(XYPoint o){

            if(this.x != o.x){

                return this.x - o.x; // Lower x first Ascending Order, o,x -this.x Descending

            } else {



                //X1=X1 => bigger height point first o.y-this.y

                //X2==X2 =>  lower height point first => this.y-o.y | this.isLeft = False

                //X1 === X2 bigger height point first => this.y-o.y

                return (this.isLeft ? -this.y : this.y) - (o.isLeft ? -o.y : o.y);

            }

        }

    }



    public List<int[]> getSkyLine(int[][] buildings){



        List<XYPoint> xypoints = new ArrayList<XYPoint>();

        //XYPoint[] xypoints = new XYPoint[buildings.length*2];

        //Creating left and right point of building
        for(int building[] : buildings){

            XYPoint xypoint1 = new XYPoint();

            XYPoint xypoint2 = new XYPoint();



            xypoint1.x = building[0];

            xypoint1.y = building[2];

            xypoint1.isLeft = true;



            xypoint2.x = building[1];

            xypoint2.y = building[2];

            xypoint2.isLeft = false;

            xypoints.add(xypoint1);

            xypoints.add(xypoint2);

        }

        Collections.sort(xypoints);

        for(XYPoint xypoint: xypoints) {

            System.out.println("After breaking : " + xypoint.x+"," + xypoint.y);

        }

        int prevMaxHeight = 0;

        //Act as a queue
        TreeMap<Integer,Integer> queue = new TreeMap<>();

        queue.put(0,1);  //Height is 0 and for one time

        List<int[]> resultSet = new ArrayList<>();

        for(XYPoint xypoint : xypoints){
            if(xypoint.isLeft){



                //Add to QUEUE

                queue.compute(xypoint.y , (k,v) -> {

                    if(v != null){

                        return v+1;

                    } else {

                        return 1;

                    }

                });
            } else {

                //Remove from queue

                queue.compute(xypoint.y , (k,v) -> {

                    if(v == 1){

                        return null;

                    } else {

                        return v-1;
                    }
                });
            }
            //GET current height after addition or removal

            int currHeight = queue.lastKey();

            if(prevMaxHeight != currHeight){

                System.out.println("length"+ resultSet.size());

                resultSet.add(new int[] {xypoint.x,currHeight});

                prevMaxHeight = currHeight;
            }
        }

        return resultSet;
    }

    public static void main(String args[]){

        int[][] buildings = {{1,3,4},{3,4,4},{2,6,2},{8,11,4},{7,9,3},{10,11,2}};

        SkyLine s = new SkyLine();

        System.out.println("Hello");

        List<int[]> resultSet = s.getSkyLine(buildings);

        System.out.println("length"+ resultSet.size());

        for(int[] a: resultSet){

            System.out.println(a[0]+"," + a[1]);

        }

    }



}

