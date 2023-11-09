//******************************************************************************************
// ApplicantDriver.java
//
// Josh Radford T00745233, Oct 21, 2023
//
// COMP 1231 Assignment 4 Question 1
// 
// This class serves as a driver class for test the Applicant and Group class functionality.
// 
//******************************************************************************************

import java.util.Comparator;

public class ApplicantDriver 
{
    
    public static void main(String[] args) 
    {
        testExhibits();
        
    }

    // Function for displaying the output example of scenario one in the assignment instructions
    public static void testExhibits()
    {
        // Creates a new Group of Applicants
        Group<Applicant> applicantList = new Group<>();

        // Creates an Applicant of standard requirements to use as a baseline for comparing members
        Applicant standardApplicant = new Applicant("standard", 60);

        // Creates 8 applicants for testing purposes and adds them to the applicantList group
        applicantList.addToGroup(new Applicant("Tom", 59));
        applicantList.addToGroup(new Applicant("Mary", 73));
        applicantList.addToGroup(new Applicant("John", 52));
        applicantList.addToGroup(new Applicant("David", 66));
        applicantList.addToGroup(new Applicant("Tracy", 50));
        applicantList.addToGroup(new Applicant("Barry", 85));
        applicantList.addToGroup(new Applicant("April", 60));
        applicantList.addToGroup(new Applicant("Sandy", 32));

        //applicantList.addToGroup(new Applicant("Randy", 59));
        //applicantList.addToGroup(new Applicant("June", 43));
        //applicantList.addToGroup(new Applicant("Patrick", 52));

        // Exits the program if no applications have been recieved
        if (applicantList.hasNoMember())
        {
            System.out.println("No applications recieved. Exiting the program.\n");
            System.exit(1);
        }

        // Prints out the details of the applicants in a readable format
        System.out.println("The following applicants are applying for the job:");
        System.out.println(applicantList.toString());
        System.out.println("Total number of applicants = " + applicantList.getNumberOfMembers() + "\n");

        System.out.println("Applicants who do not fulfill typing speed test requirement:");

        // Creates a new ArrayList to store Applicants that have a typing speed >= standardApplicant
        Group<Applicant> candidateList = new Group<>();

        // Parses through the applicantList and adds applicants that are >= standardApplicant typing speed to new candidateList
        for (Applicant applicant : applicantList.getListOfMembers()) 
        {
            if (applicant.getTypingSpeed() >= standardApplicant.getTypingSpeed()) 
            {
                candidateList.addToGroup(applicant);
            }
            else
            {
                System.out.println("Remove: " + applicant.toString());
            }
        }

        // Prints the list of candidates who fulfilled the typing speed test requirement
        System.out.println("\nCandidates who have fulfilled typing speed test requirement:");
        if (candidateList.hasNoMember())
        {
            System.out.println("No candidate has been selected!\n");
        }
        else
        {
            System.out.println(candidateList.toString());
        }

        // Prints the candidate who was removed from the list for being last submitted, and removes them from the candidateList
        System.out.println("The following candidate who submitted their application last has been removed from the list:");
        if (candidateList.hasNoMember())
        {
            System.out.println("No candidate in the list.\n");
        }
        else
        {
            if (candidateList.getNumberOfMembers() > 1)
            {
                System.out.println("Remove: " + candidateList.getListOfMembers().getLast() + "\n");
                candidateList.removeFromGroup();
            }
            else
            {
                System.out.println("There is only one candidate, therefore they will not be removed.\n");
            }
        }

        // Sorts the candidates in the candidateList by their typing speed from fastest to slowest
        System.out.println("The candidates sorted in descending order based on their typing speed:");
        if (candidateList.hasNoMember())
        {
            System.out.println("No candidate in the list.\n");
        }
        else
        {
            candidateList.getListOfMembers().sort(Comparator.naturalOrder());
            System.out.println(candidateList.toString());
        }
    }
}
