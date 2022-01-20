/*
* MCQ Test System
*
* Version:      1.1.1
* Author:       John Daniel M. Tejero
* Date Created: 1/14/22
*
* Changelogs:
* As of January 14, 2022
* -Created an abstract class which holds the name and the subject question set
* -Created a class called StudentProfile that contains the statistics of the student
* -Changed the overall structure of the main method
* -Reduced Unnecessary instantiation of variable.
*
* As of January 15, 2022
* -QuestionCounter increments now regardless of the condition (right or wrong answer) reducing the number of lines
* -Refactored Info to StudentProfile
* -Refactored StudentProfile to StudentStat
* -Removed the static identified in arraylist in retrieve question
* */

package com.bdse.pfs.summative;

import com.bdse.pfs.summative.PhaseI.StudentStat;
import com.bdse.pfs.summative.PhaseII.QuestionAndAnswer;
import com.bdse.pfs.summative.PhaseIII.ResultDisplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //getting information
        StudentStat Student = new StudentStat(); /*Instantiation of new Student Class*/
        Student.getInformation(); /*Gather Information and store it on Info class*/

        //question and answer
        QuestionAndAnswer QuestionPrompt = new QuestionAndAnswer();
        QuestionPrompt.promptQuestion(Student.getQuestions(), Student.getChoices(), Student.getAnswers());
        /* Calls the method promptQuestion on QuestionAndAnswer Class
         *
         * It iterates all the question until the loop breaks
         * Stores the score gathered in StudentProfile
         *
         * */
        //result
        Student.setFinalPoints(QuestionPrompt.getFinalPoints());
        Student.setMistakes(QuestionPrompt.getMistakes());
        Student.setPercentScore(QuestionPrompt.getPercentScore());
        Student.setMaxQuestion(QuestionPrompt.getMaxQuestion());

        ResultDisplay DisplayProfile = new ResultDisplay(); /* instantiate ResultDisplay*/
        DisplayProfile.retrieveResult(Student.getName(), Student.getSubject(), Student.getFinalPoints(),
                Student.getMistakes(), Student.getPercentScore(), Student.getMaxQuestion());/* display result */

        //Feature added not in the Project Brief
        System.out.println("Do you want to see your stats? Type Y for yes and N for no");
        while(true){
            Scanner DisplayStat = new Scanner(System.in);
            String Stats = DisplayStat.next();

            if (Stats.equalsIgnoreCase("Y")){
                System.out.println("Here is the overall statistics of your MCQ test. \n");
                System.out.println(Student + "\n");
                System.out.println("Thank you for answering, have a nice day!");
                break;
            }else if (Stats.equalsIgnoreCase("N")){
                System.out.println("Thank you for answering, have a nice day!");
                break;
            }else{
                System.out.println("Please enter an appropriate response");
            }
        }
    }
}
