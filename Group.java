//******************************************************************************************
// Group.java
//
// Josh Radford T00745233, Oct 21, 2023
//
// COMP 1231 Assignment 4 Question 1
// 
// This class initializes a Group object and provides helper methods that store an 
// ArrayList of type T objects.
// 
//******************************************************************************************

import java.util.ArrayList;

public class Group<T> 
{

    private ArrayList<T> aList;

    // Default constructor that creates an instance of an ArrayList of type T
    public Group() 
    {
        aList = new ArrayList<>();
    }

    // Getter method for accessing members in the Group ArrayList
    public ArrayList<T> getListOfMembers() {
        return aList;
    }

    // Setter method for adding a member to the ArrayList
    public void addToGroup(T member)
    {
        aList.add(member);
    }

    // Setter method for removing the last member from the ArrayList
    public void removeFromGroup()
    {
        if (!aList.isEmpty()) 
        {
            aList.remove(aList.size()-1);
        }
    }

    // Overloaded method for removing a specified member from the ArrayList
    public void removeFromGroup(T member)
    {
        if(aList.contains(member))
        {
            aList.remove(member);
        }
    }

    // Getter method that returns the number of members in the ArrayList
    public int getNumberOfMembers()
    {
        return aList.size();
    }

    // Getter method that returns true if there are no members in the ArrayList, false otherwise
    public boolean hasNoMember()
    {
        return aList.isEmpty();
    }

    // Method that returns all members in a list as a String in a readable format
    public String toString()
    {
        String membersInList = "";

        for (T member : aList) {
            membersInList += member.toString() + "\n";
        }

        return membersInList;
    }

}
