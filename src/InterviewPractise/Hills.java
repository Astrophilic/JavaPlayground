package InterviewPractise;

import java.util.List;

public class Hills {


    public  Integer findMaxHeight(List<Integer> heights){

        int lo = 0;
        int hi = heights.size();


        while(lo<hi){

            int mid = lo + ( hi-lo)/2;

            if((mid>0) && mid+1 < hi && heights.get(mid)> heights.get(mid-1) && heights.get(mid)>heights.get(mid+1)){
                return heights.get(mid);
            }
            else if( heights.get(lo)<heights.get(mid)){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return heights.get(hi-1);
    }

    public Integer getMaxHeightOfWater(List<Integer>altitudes){

        Integer maxHeight = 0;
        Integer secondMaxHeight =0;

        for (int i = 0; i < altitudes.toArray().length; i++) {

            if(altitudes.get(i)> maxHeight){
                Integer temp = maxHeight;
                maxHeight=altitudes.get(i);
                secondMaxHeight=temp;
            }

        }
        return secondMaxHeight;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
