import java.util.ArrayList;
import java.util.List;

public class ProductOfArray{
    public static void main(String[] args){
        int[] nums = {1,2,4,6};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0;j < nums.length; j++){
                if(j != i){
                   product *= nums[j];
                }
            }
            list.add(product);
        }
        System.out.println(list);
    }
}