//***********************************************************
//  Cube.java
//
//  Dustin Kaban
//  July 20th, 2020
//
//  This interface is created to control the setup of tasks.
//  It contains an Enumeration for PriorityValue which is key
//  to sorting between priority of tasks.
//  There is also a get and set method for Priority Values
//***********************************************************

public interface Priority
{
    // Constant declarations
    enum PriorityValue
    {
        Critical,
        Important,
        Normal,
        Low,
        NotImportant
    }

    // Method signatures
    void setPriority(PriorityValue value);
    PriorityValue getPriority();
}
