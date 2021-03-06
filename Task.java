//***********************************************************
//  Cube.java
//
//  Dustin Kaban
//  July 20th, 2020
//
//  This class contains all the information about a Task.
//  It implements the Priority interface and the Comparable interface
//  to allow for properly setting up a task system.
//***********************************************************

public class Task implements Priority, Comparable
{
    //A string to know information about the Task and its Priority Value
    public String description;
    private PriorityValue priorityValue;

    //Constructor
    public Task(String details, PriorityValue value)
    {
        description = details;
        priorityValue = value;
    }

    //Sets the priority value
    public void setPriority(PriorityValue value)
    {
        priorityValue = value;
    }

    //Gets the priority value
    public PriorityValue getPriority()
    {
        return priorityValue;
    }

    //Compares two Tasks based on priorityvalue
    @Override
    public int compareTo(Object obj)
    {
        if(this.priorityValue == null) return 0;
        Task taskToCompare = (Task) obj;
        
        if(taskToCompare.priorityValue == null) return 0;

        return priorityValue.compareTo(taskToCompare.priorityValue);
    }

    //To help with formatting display text
    public String toString()
    {
        return "Description: " + description + ", Priority: " + this.getPriority();
    }
}
