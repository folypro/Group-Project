
// Zach Bowman
//Abdulbasit Adeniji
// Started 05/02/2022
// Athena's Mortgage Calculator
// Description: This program will take the user's information, loan amount, loan term, loan rate.
// It will then display back to the user information on the loan and how much they will be paying monthly.

// Zach Bowman -- For other in the team, I have started getting the outline of our project together.
// I will commit this to github so everyone can add their touches and part to it before it is due.
// Please make sure to help with the outline of our project or add something.

//Abdulbasit Adeniji -- I will be working on the input section for the user on 5/2/2022


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
    String userName;
    int user_loan_amount;
    int user_loan_year;
    double user_loan_interest_rates;

    private Label myLabel;
    private Label mortgage_calc_description;
    private Label loan_amount_prompt;
    private Label loan_interest_rate_prompt;

    //Empty fields that will hold the total amount paid, interest paid, and monthly mortgage.
    private TextField text_field_total_amount_paid;
    private TextField text_field_interest_paid;
    private TextField text_field_monthly_mortgage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Labels
        Label myLabel = new Label("ATHENA'S MORTGAGE CALCULATOR");
        //Will be the description of the application to user
        Label mortgage_calc_description = new Label("Welcome to Athena's Mortgage Calculator." +
                "Enter all required information for your monthly payment.");
        //Will be the description to get the user's information for loan amount, years of the loan, and interest rate from the user.
        Label loan_amount_prompt = new Label("Please enter the loan amount for your mortgage:");
        Label loan_year_prompt = new Label("Please enter the years your loan is for:");
        Label loan_interest_rate_prompt = new Label("Please enter the interest rate for your loan:");


        //Text Fields
        text_field_interest_paid = new TextField();
        text_field_total_amount_paid = new TextField();
        text_field_monthly_mortgage = new TextField();

        // Button to convert the information
        Button calcButton = new Button("RESULT");

        //Event handler
        calcButton.setOnAction(event ->{
            
        });


        // HBox or VBox information

        // alignment if needed

        // padding

        // Scene

        // Stage

        // Title the stage

        // Show window

    }
}
