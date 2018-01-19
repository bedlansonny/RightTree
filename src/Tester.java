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

            for(int lvl = 0; Math.pow(2, lvl) <= nums.length; lvl++)
            {
                System.out.print(lvl + " ");
                //if leftsum > rightsum return false
                //else keep going
            }
            System.out.println();
        }
    }
}
