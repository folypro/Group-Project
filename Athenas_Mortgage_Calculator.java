// Zach Bowman
// Started 05/02/2022
// Athena's Mortgage Calculator
// Description: This program will take the user's information, loan amount, loan term, loan rate.
// It will then display back to the user information on the loan and how much they will be paying monthly.

// Zach Bowman -- For other in the team, I have started getting the outline of our project together.
// I will commit this to github so everyone can add their touches and part to it before it is due.
// Please make sure to help with the outline of our project or add something.

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.*;

public class Athenas_Mortgage_Calculator extends Application
{

    // Global Variables

    // Fields
    private TextField
                        users_name, // Users input for his name.

                        users_loan_amount, // Users input for the loan amount.

                        users_loan_years, // Users input for the loan amount in years.

                        users_interest_rate; // Users input for the interest rate.

    //Labels
    private Label
                        text_field_total_amount_paid, // Empty field to hold the total amount paid.

                        text_field_interest_paid, // Empty field to hold the interest only paid.

                        text_field_monthly_mortgage; // Empty field to hold the monthly mortgage.



    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {

        // Labels
        Label
                loan_amount_prompt = new Label("Please enter the loan amount for your mortgage:"), // Will be the description to get the users information for loan amount

                loan_years_prompt = new Label("Please enter the years your loan is for:"), // Will be the description to get the users years of the loan

                loan_interest_rate_prompt = new Label("Please enter the interest rate for your loan:"), // Will be the description to get the interest rate from user.

                mortgage_calc_description = new Label("Welcome to Athena's Mortgage Calculator." +
                        " Enter all required information for your monthly payment."); // Will be the description of the application to the user.

        //Text Fields

        // Button to convert the information

        // HBox or VBox information

        // alignment if needed

        // padding

        // Scene

        // Stage

        // Title the stage

        // Show window

    }
}
