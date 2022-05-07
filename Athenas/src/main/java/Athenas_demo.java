package Athenas.src.main.java;
// Zach Bowman
//Abdulbasit Adeniji
// Started 05/02/2022
// Athena's Mortgage Calculator
// Description: This program will take the user's information, loan amount, loan term, loan rate.
// It will then display back to the user information on the loan and how much they will be paying monthly.

// Zach Bowman -- For other in the team, I have started getting the outline of our project together.
// I will commit this to github so everyone can add their touches and part to it before it is due.
// Please make sure to help with the outline of our project or add something.
// I will help with calcution and variables. organizing.

//Abdulbasit Adeniji -- I will be working on the input section for the user on 5/2/2022

//Andrew Angell -- i will be working on the Calcbutton section for the user on 5/4/2022.


import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Athenas_demo extends Application {

    // Global Variables

    // String Global
     String userName;

    // Int Global
    int user_loan_amount;
    int user_loan_year;

    // Double Global
    double user_loan_interest_rates;

    // Global Labels

    // private Label myLabel;
    // private Label mortgage_calc_description;
    // private Label loan_amount_prompt;
    // private Label loan_interest_rate_prompt;

    // I commented these out because these do not need to be global and they are double listed
    // I have added the labels that need to be global

    //Labels
    private Label label_total_amount_paid; // Empty label to hold the total amount paid.

    private Label label_interest_paid; // Empty label to hold the interest only paid.

    private Label label_monthly_mortgage; // Empty label to hold the monthly mortgage.

    private Label label_users_name; // Empty label to hold the users name.


    //Empty fields that will hold the total amount paid, interest paid, and monthly mortgage and name
    private TextField
                    text_field_users_name, // Users input for his name.

                    text_field_users_loan_amount, // Users input for the loan amount.

                    text_field_users_loan_years, // Users input for the loan amount in years.

                    text_field_users_interest_rate; // Users input for the interest rate.



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Labels

        // Application name
        Label myLabel = new Label("ATHENA'S MORTGAGE CALCULATOR");

        //Will be the description of the application to user
        Label mortgage_calc_description = new Label("Welcome to Athena's Mortgage Calculator." +
                "Enter all required information for your monthly payment.");

        //Will be the description to get the user's information for loan amount, years of the loan, and interest rate from the user.
        Label loan_amount_prompt = new Label("Please enter the loan amount for your mortgage:");

        Label loan_year_prompt = new Label("Please enter the years your loan is for:");

        Label loan_interest_rate_prompt = new Label("Please enter the interest rate for your loan:");

        Label ask_user_his_name = new Label("Please tell me your name, I am Athena and you are?:");


        // labels for the output for VBox
        Label
                description_name = new Label("Here are your results "), // name will be inserted via HBox.
                description_total_amount_paid = new Label("Total amount paid:"),
                description_interest_paid = new Label("Interest paid:"),
                description_monthly_mortage = new Label("Monthly mortgage:");


        //Text Fields
        text_field_users_name = new TextField();
        text_field_users_loan_amount = new TextField();
        text_field_users_interest_rate = new TextField();
        text_field_users_loan_years = new TextField();

        // Button to convert the information
        Button calcButton = new Button("RESULT");

        //Event handler
        calcButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double l= Double.parseDouble(text_field_users_loan_amount.getText()); //Double to hold the loan value
                double y = (Double.parseDouble(text_field_users_loan_years.getText()) * 12); //Double to hold the years
                double r = (Double.parseDouble(text_field_users_interest_rate.getText()) / 100); //Double to hold the rate
                double total = (l*( r*(Math.pow((1+r),y ))/ (Math.pow((1+r),y) -1))); //Calculates the total
                r = r*100;
                label_interest_paid.setText("The interest rate you had was " + r +"%");//Changes interest paid text to reflect the numbers
                label_total_amount_paid.setText("The total price of the loan was $" + l );// changes total amount paid text to reflect numbers
                label_monthly_mortgage.setText("The total you will pay in a month is $" + total + " for " + y + " months.");//changes the text accordingly
            }
        });



        // HBox or VBox information

        //HBox for questions
        // Name input
        HBox h_box_1_inputs_and_questions = new HBox(ask_user_his_name,text_field_users_name);

        // Loan amount input
        HBox h_box_2_inputs_and_questions = new HBox(loan_amount_prompt,text_field_users_loan_amount);

        // Loan interest rate input
        HBox h_box_3_inputs_and_questions = new HBox(loan_interest_rate_prompt,text_field_users_interest_rate);

        // Loan lifespan in years input
        HBox h_box_4_inputs_and_questions = new HBox(loan_year_prompt,text_field_users_loan_years);


        // HBox for outputs
        HBox
                // Name output
                output_1_h_box_name = new HBox(description_name, label_users_name),

                // Total amount paid interest + loan amount
                output_2_h_box_total_amount_paid = new HBox(description_total_amount_paid, label_total_amount_paid),

                // Interest only paid
                output_3_h_box_interest_paid = new HBox(description_interest_paid, label_interest_paid),

                // Monthly mortgage
                output_4_h_box_monthly_mortgage = new HBox(description_monthly_mortage, label_monthly_mortgage);

        // Vbox to organize the HBox and the rest of the questions
        VBox v_box_organizer = new VBox
                (
                        15,
                        myLabel,
                        mortgage_calc_description,
                        h_box_1_inputs_and_questions,
                        h_box_2_inputs_and_questions,
                        h_box_3_inputs_and_questions,
                        h_box_4_inputs_and_questions,
                        calcButton,
                        output_1_h_box_name,
                        output_2_h_box_total_amount_paid,
                        output_3_h_box_interest_paid,
                        output_4_h_box_monthly_mortgage
                );
      
      // Position

        v_box_organizer.setAlignment(Pos.CENTER);

        //set the padding!
        v_box_organizer.setPadding(new Insets(15));

        // Scene
        Scene scene = new Scene(v_box_organizer, 500,500);

        // Stage
        primaryStage.setScene(scene);
        // Title the stage
        primaryStage.setTitle("ATHENA'S MORTGAGE CALCULATOR");
        // Show window
        primaryStage.show();
    }
}
