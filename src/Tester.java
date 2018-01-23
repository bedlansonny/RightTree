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

            System.out.println(line + " " + isRight(nums));

        }
    }

    //make truelength method? (round up to compensate for no zeros on the end)

    public static boolean isRight(int[] nums)
    {
        for(int i = nums.length-2; i > 0; i--)
        {
            //if i > i+1 return false
            if(nums[i] > nums[i+1])
                return false;

            //add 1 to parent for each that is 1
            if(nums[i] > 0)
                nums[(i-1)/2]++;
            if(nums[i+1] > 0)
                nums[(i-1)/2]++;

        }
        return true;
    }
}