//******************************************************************************************
// Applicant.java
//
// Josh Radford T00745233, Oct 21, 2023
//
// COMP 1231 Assignment 4 Question 1
// 
// This class initializes a Applicant object with two attributes: name and typingSpeed. 
//******************************************************************************************

public class Applicant implements Comparable<Applicant> 
{

    private String name;
    private int typingSpeed;
    
    // Default constructor with no parameters
    public Applicant(){}
    
    
    // Constructor that initializes an Applicant with their name and typing speed
    public Applicant(String name, int typingSpeed)
    {
        this.name = name;
        this.typingSpeed = typingSpeed;
    }

    // Getter method that returns an Applicant's name
    public String getName() 
    {
        return name;
    }

    // Setter method that sets an Applicant's name
    public void setName(String name) 
    {
        this.name = name;
    }

    // Getter method that returns an Applicant's typing speed
    public int getTypingSpeed() 
    {
        return typingSpeed;
    }

    // Setter method that sets an Applicant's typing speed
    public void setTypingSpeed(int typingSpeed) 
    {
        this.typingSpeed = typingSpeed;
    }

    // Method that returns the Applicant's name and typing speed in a readable format
    public String toString()
    {
        return "Name = " + name + "\t | \t" + "Typing Speed(words/min) = " + typingSpeed;
    }
    
    // Method to compare two applicants according to their typing speed
    @Override
    public int compareTo(Applicant otherApplicant) 
    {
        return Integer.compare(otherApplicant.typingSpeed, this.typingSpeed);
    }

}