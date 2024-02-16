package com.careerit.jfs.quiz;

import java.util.List;
import java.util.Scanner;

public class QuizService {
    private List<Question> questions;
    public QuizService(){
    this.questions =QuizUtil.getQuestions();
}
public void startQuiz(String userName){
    System.out.println("Welcome to the quiz : " +userName);
    System.out.println("--------------------------------------");
    System.out.println("Total questions : "+questions.size());
    Scanner sc = new Scanner(System.in);


    //Show the question and options
    //Get the answer from the uer
    //Check user answer with the correct answer
    //If answer is correct increment the score
    //Show the next question
    //Repeat the process till all questions are answered
    //Show the score
    int qno =1 ;
    int score = 0;
    for(Question question : questions) {
        System.out.println("Qno : "+qno);
        System.out.println(question.getQuestion());
        List<String> options = question.getOptions();
        for(int i = 0 ; i<options.size();i++){
        System.out.println((i + 1) + "-" + options.get(i));
    }
        System.out.println("Enter your choice : ");
        int ch =sc.nextInt();
        if(ch == question.getAnswer()) {
            score++;
        }
        qno++;
        }
     for(Question question : questions){
         System.out.println(question.getQno()+"-" +question.getQuestion());
         List<String> options = question.getOptions();
     for(int i = 0 ; i<options.size();i++){
             System.out.println((i+1)+"-"+options.get(i));
         }
         System.out.println("Enter your answer : ");
         int userAnswer = sc.nextInt();
     if(userAnswer == question.getAnswer()){
         score++;
     }
     }
    System.out.println("Total Question are : " +questions.size());
    System.out.println("Total correct answers are : " +score);
    System.out.println("Total wrong answers are : " +(questions.size()-score));
    }
}
