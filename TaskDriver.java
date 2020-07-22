//***********************************************************
//  Cube.java
//
//  Dustin Kaban
//  July 20th, 2020
//
//  This class creates a series of tasks and tests their functionality,
//  displaying the output to the user.
//***********************************************************

public class TaskDriver
{
    public static void main(String[] args)
    {
        //Creating new Task Objects
        Task eat = new Task("Eat", Priority.PriorityValue.Critical);
        Task sleep = new Task("Sleep", Priority.PriorityValue.Important);
        Task study = new Task("Study", Priority.PriorityValue.Normal);
        Task meetFriends = new Task("Meet Friends", Priority.PriorityValue.Low);
        Task playGames = new Task("Play Games",Priority.PriorityValue.NotImportant);

        //Array of tasks to help with displays
        Task[] tasks = { eat,sleep,study,meetFriends,playGames };

        //Loop to display initial task information
        for(int i=0;i<tasks.length;i++)
        {
            System.out.println(tasks[i].toString());
        }

        //Outputs to test functionality
        System.out.println("********************************");
        System.out.println(tasks[0].toString());
        System.out.println("********************************");
        System.out.println("Comparing " + tasks[0].description
                + " to " + tasks[1].description);
        System.out.println(comparisonResults(tasks[0],tasks[1]));
        System.out.println("********************************");
        System.out.println("Changing Priority of " + tasks[0].description
                + " to Low");
        tasks[0].setPriority(Priority.PriorityValue.Low);
        System.out.println(tasks[0].toString());
    }

    //Created to test output.  Uses the compareTo function and sets Output Text accordingly
    public static String comparisonResults(Task task1, Task task2)
    {
        int result = task1.compareTo(task2);

        if(result > 0)
        {
            return task1.description + " is a lower priority level than "
                    + task2.description + " by: " + result;
        }
        else if(result < 0)
        {
            return task1.description + " is a higher priority level than "
                    + task2.description + " by: " + (result*-1);
        }
        else if(task1.getPriority() == null || task2.getPriority() == null)
        {
            return "Invalid Comparison, task cannot be Null";
        }
        else
        {
            return task1.description + " and " + task2.description
                    + " are equal in priority";
        }

    }
}
