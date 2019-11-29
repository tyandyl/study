import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tianye on 2019/11/28
 */
public class Sum {
    
    public static void main(String[] args){
    
    }
    
    //两数只和
    public List<Integer[]> twoSum(int[] nums, int target) {
        List<Integer[]> ss=new ArrayList<Integer[]>();
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            Integer index = map.get(nums[i]);
            if(index==null){
                map.put(target-nums[i],i);
            }else {
                ss.add(new Integer[]{index,i});
            }
        }
        return ss;
    }
    
    public List<Integer[]> threeSum(int[] nums, int target) {
        return null;
    }
}
