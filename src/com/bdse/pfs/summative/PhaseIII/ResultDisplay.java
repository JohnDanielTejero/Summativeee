package com.bdse.pfs.summative.PhaseIII;

import com.bdse.pfs.summative.PhaseI.StudentStat;
import java.util.Scanner;

public class ResultDisplay extends StudentStat {


    public void retrieveResult(String name, String subject, int finalPoints, int mistakes,
                               double percentScore, int maxQuestion) { //Method that displays the final result

        System.out.println("Hi " + name + ", You answered " + finalPoints +" Questions Right, " + mistakes +
                " Questions Wrong for a total of " + maxQuestion + " Questions. You scored " + percentScore + "%");

    }

}
