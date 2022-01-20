package com.bdse.pfs.summative.PhaseI;

import com.bdse.pfs.summative.StudentProfile;

import java.util.ArrayList;

public class StudentStat extends StudentProfile {

    //Instantiation
    private double PercentScore;
    private int FinalPoints;
    private int Mistakes = 0;
    private int MaxQuestion;

    //setter
    public void setMaxQuestion(int maxQuestion) {
        MaxQuestion = maxQuestion;
    }

    public void setMistakes(int mistakes) {
        Mistakes = mistakes;
    }

    public void setFinalPoints(int finalPoints) {
        FinalPoints = finalPoints;
    }

    public void setPercentScore(double percentScore) {
        PercentScore = percentScore;
    }

    //getter
    public int getFinalPoints() {
        return FinalPoints;
    }

    public double getPercentScore() {
        return PercentScore;
    }

    public int getMaxQuestion() {
        return MaxQuestion;
    }

    public int getMistakes() {
        return Mistakes;
    }


    //setter

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSubject(String subject) {
        super.setSubject(subject);
    }

    @Override
    public void setAnswers(ArrayList<String> answers) {
        super.setAnswers(answers);
    }

    @Override
    public void setChoices(ArrayList<String> choices) {
        super.setChoices(choices);
    }

    @Override
    public void setQuestions(ArrayList<String> questions) {
        super.setQuestions(questions);
    }

    //getter
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSubject() {
        return super.getSubject();
    }

    @Override
    public ArrayList<String> getChoices() {
        return super.getChoices();
    }

    @Override
    public ArrayList<String> getAnswers() {
        return super.getAnswers();
    }

    @Override
    public ArrayList<String> getQuestions() {
        return super.getQuestions();
    }

    @Override
    public void getInformation() {
        InformationGather GatherInformation = new InformationGather(); //Instantiate Gathering Class
        GatherInformation.informations(); //Calls on information gathering method
        this.setName(GatherInformation.getName());
        this.setSubject(GatherInformation.getSubject());
        RetrieveQuestion RetrieveSet = new RetrieveQuestion(); //Instantiate Gathering Class
        RetrieveSet.setSubject(this.getSubject());
        RetrieveSet.retrieve(); //Calls on information gathering method
        this.setQuestions(RetrieveSet.getQuestions());
        System.out.println(RetrieveSet.getQuestions().get(1));
        this.setChoices(RetrieveSet.getChoices());
        this.setAnswers(RetrieveSet.getAnswers());

    }

    @Override
    public String toString() {
        return "Name:'" + getName() + '\'' + "\n" +
                "Subject:'" + getSubject() + '\'' + "\n"+
                "Score:" + getFinalPoints() + "/" + getMaxQuestion() + "\n" +
                "Percentage:" + getPercentScore() + "%";
    }
}
