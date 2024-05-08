//import java.util.ArrayList;
//import java.lang.*;
//
//
//public class Main
//{
//    public static void main (String[] args)
//    {
//        Integer[] nums = {1, 1,2, 3, 4, 5,1,1,2};
//        ArrayList<Integer> listNums = new ArrayList<>();
//        for (int i = 0; i < nums.length ; i++)
//        {
//            for (int j = nums.length - 1; i >= 0; i--)
//            {
//
//                if(nums[j] == nums[i] && j != i)
//                {
//                    if (!listNums.contains(nums[i]))
//                    {
//                        listNums.add(nums[i]);
//                        System.out.println("povtoryayuschiesya element " + nums[i]);
//                    }
//                }
//            }
//        }
//    }
//}

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] nums = {1, 1, 2, 3, 4, 5, 1, 1, 2, 4};
        ArrayList<Integer> listNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = nums.length - 1; j >= 0; j--)
            {
                if (nums[j] == nums[i] && j != i)
                {
                    if (!listNums.contains(nums[i]))
                    {
                        listNums.add(nums[i]);
                        System.out.println("Повторяющийся элемент: " + nums[i]);
                    }
                }
            }
        }
    }
}
// s(end-start)/ 2
