import java.util.ArrayList;
import java.util.Random;

public class ListMax
{
    public static int findMax(ArrayList<Integer> nums)
    {
        // your code here
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++)
        {
            if (nums.get(i) > max)
            {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        
        // replace this with a loop that generates and adds random numbers to the list
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100) + 1);
        }
        
        System.out.println("Max: " + findMax(list));
    }
}