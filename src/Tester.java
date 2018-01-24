import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String args[]) throws IOException
    {
        Scanner in = new Scanner(new File("input.txt"));
        int testCaseNum = in.nextInt();
            in.nextLine();

        for(int testCaseInd = 0; testCaseInd < testCaseNum; testCaseInd++)
        {
            String line = in.nextLine();
            char[] chars = line.toCharArray();
            int[] nums = new int[chars.length];
            for(int i = 0; i < chars.length; i++)
                nums[i] = (int)chars[i]-48;
            int[] filledArr = new int[(int)Math.pow(2, (int)Math.ceil(Math.log(nums.length+1)/Math.log(2)))-1];
            System.arraycopy(nums, 0, filledArr, 0, nums.length);

            System.out.println(isRight(filledArr));

        }
    }

    public static boolean isRight(int[] nums)
    {
        for(int i = nums.length-2; i > 0; i-=2)
        {
            if(nums[i] > nums[i+1])
                return false;
            nums[(i-1)/2] += nums[i] + nums[i+1];
        }
        return true;
    }
}