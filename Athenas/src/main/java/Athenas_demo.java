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

//Abdulbasit Adeniji -- I will be working on the input section for the user on 5/2/2022

//Andrew Angell -- i will be working on the Calcbutton section for the user on 5/4/2022.


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

import static javafx.application.Application.launch;
//
public class Athenas_demo extends Application {

    // Global Variables

    // String Global
    String userName;


    // Double Global
    double user_loan_amount;
    double user_loan_year;
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

        //ints, Booleans, Checkboxes, and radiobuttons


        RadioButton Male = new RadioButton("Male");
        RadioButton Female = new RadioButton("Female");
        ToggleGroup rg = new ToggleGroup();
        Label Abbreviation = new Label("");
        Label Formality = new Label("");
        Male.setToggleGroup(rg);
        Female.setToggleGroup(rg);
        Male.setOnAction(event -> {Abbreviation.setText("1");});
        Female.setOnAction(event -> {Abbreviation.setText("2");});






        // Labels

        Label question = new Label("Please choose your sex.");
        // Application name
        Label myLabel = new Label("ATHENA'S MORTGAGE CALCULATOR");

        //Will be the description of the application to user
        Label mortgage_calc_description = new Label("Welcome to Athena's Mortgage Calculator." +
                "Enter all required information for your monthly payment.");

        //Will be the description to get the user's information for loan amount, years of the loan, and interest rate from the user.
        Label loan_amount_prompt = new Label("Please enter the loan amount for your mortgage: ");

        Label loan_year_prompt = new Label("Please enter the years your loan is for: ");

        Label loan_interest_rate_prompt = new Label("Please enter the interest rate for your loan: ");

        Label ask_user_his_name = new Label("Please tell me your name, I am Athena and you are?: ");


        // labels for the output for VBox
        Label
                description_name = new Label("Here are your results "), // name will be inserted via HBox.
                description_total_amount_paid = new Label("Total amount paid: "),
                description_interest_paid = new Label("Interest paid: "),
                description_monthly_mortage = new Label("Monthly mortgage: ");


        //Text Fields
        text_field_users_name =new

                TextField();

        text_field_users_loan_amount =new

                TextField();

        text_field_users_interest_rate =new

                TextField();

        text_field_users_loan_years =new

                TextField();

        TextField codeverification = new TextField();

        //Button for confirming


        // Button to convert the information
        Button calcButton = new Button("RESULT");

        // Event Handler
        calcButton.setOnAction(event ->

        {

            //Switch Statement for gender
            Abbreviation.setText("" +Integer.parseInt(Abbreviation.getText()));

            int sex = Integer.parseInt(Abbreviation.getText());

            switch (sex){
                case 1: Formality.setText("Mr. ");

                case 2: Formality.setText("Mrs. ");

            }

            // Set the users name
            label_users_name.setText(Formality.getText() + text_field_users_name.getText());

            // Getting Loan from user
            Double loan = Double.parseDouble(text_field_users_loan_amount.getText());

            // Making sure loan is filled in
            if (loan > 0) {

                // Getting C/interest from the user
                Double interest = Double.parseDouble(text_field_users_interest_rate.getText());

                // Making sure interest is filled in
                if (interest > 0) {

                    // Getting N or Number of payments
                    Double years = Double.parseDouble(text_field_users_loan_years.getText());

                    // Making sure years is filled in
                    if (years > 0) {
                        // Payments need to be x12 for months
                        Double n_or_months = years * 12;

                        // Interest needs to be divided by 12
                        Double interest_per_month_or_c = (interest / 12) / 100;

                        // Interest needs plus 1
                        Double c_and_1 = interest_per_month_or_c + 1;

                        // c and 1 to the power of months
                        Double math_power_c_1_months = Math.pow(c_and_1, n_or_months);

                        // Monthly payments
                        Double monthly_payments = loan * (interest_per_month_or_c * (math_power_c_1_months)) / ((math_power_c_1_months) - 1);

                        // Set monthly mortgage to the new amount
                        label_monthly_mortgage.setText(String.format("$"+" %,.0f", monthly_payments));

                        // Find the total amount paid
                        Double total_amount = monthly_payments * n_or_months;

                        // Set the total amount
                        label_total_amount_paid.setText(String.format("$"+" %,.2f", total_amount));

                        // Find the interest paid
                        Double interest_only = total_amount - loan;

                        // Set the interest paid
                        label_interest_paid.setText(String.format("$" +" %,.2f", interest_only));
                    }
                }

            }

        });

        // Needs this to hold the information or throws an error.
        label_interest_paid =new

                Label();

        label_total_amount_paid =new

                Label();

        label_monthly_mortgage =new

                Label();

        label_users_name =new

                Label();



        // HBox or VBox information

        //HBox for questions
        // Name input
        HBox h_box_1_inputs_and_questions = new HBox(ask_user_his_name, text_field_users_name);

        // Loan amount input
        HBox h_box_2_inputs_and_questions = new HBox(loan_amount_prompt, text_field_users_loan_amount);

        // Loan interest rate input
        HBox h_box_3_inputs_and_questions = new HBox(loan_interest_rate_prompt, text_field_users_interest_rate);

        // Loan lifespan in years input
        HBox h_box_4_inputs_and_questions = new HBox(loan_year_prompt, text_field_users_loan_years);

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
                        10,
                        myLabel,
                        Abbreviation,
                        question,
                        Male,
                        Female,
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


        //Set the position
        v_box_organizer.setAlignment(Pos.CENTER);

        //set the padding!
        v_box_organizer.setPadding(new

                Insets(15));
        //booleans made to identify if verifications was passed, first 2 labels for the setonaction loop. while the checkbox
        //remaining labels, button, adn textfield are for other things.
        //all the code here is for the new window, seperated for distinction
        boolean match = false;
        boolean human = false;
        boolean firstrun = false;
        //labels v and h are for use as variables, only reason they show up within is for the sake of debugging
        Label h = new Label("f");
        Label v = new Label("f");
        final int code = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        CheckBox verify = new CheckBox("I am Human");
        Label humantest = new Label("Please Enter in the code and click the checkbox to verify that youre a human.");
        Label instruct = new Label("The Code is: " + code);
        Button conbutton = new Button("Verify");

        //new Stage for verification
        Stage prep = new Stage();

        //Vbox for Verification
        VBox confirmation = new VBox(
                10,
                humantest,
                instruct,
                codeverification,
                verify,
                conbutton,
                v,
                h
        );
        confirmation.setAlignment(Pos.CENTER);
        Scene SCENE2 = new Scene(confirmation);
        prep.setScene(SCENE2);
        //the comment below shows the show, whilie the while loop is run. first run was going to be used for ensuring the above code would be intitialized
        //in hope that i could use the window in the while loop, but that didnt work
        // prep.show();
        //while the human and match booleans are false, they arent used
        //        while (!human || !match){
        //
        //
        //
        //
        //
        //
        //    firstrun = true;
//
        conbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                h.setText("" + codeverification.getText());
                if (verify.isSelected()){
                    v.setText("t");
                }
                else v.setText("f");
                if (Integer.parseInt(codeverification.getText()) == code){
                    h.setText("t");
                }
                else h.setText("f");

            }
//
        });
        //code here is meant to check the strings, and if they match a letter, then activate the conditions to break the loop
//            if (h.toString() == "t")
//                human = true;
//            else
//                human = false;
//            if (v.toString() == "t")
//                match = true;
//            else match = false;
//            if (match && human){
//                prep.close();
//            }
//        }

        // Scene
        Scene scene = new Scene(v_box_organizer, 800, 800);


        // Stage

        primaryStage.setScene(scene);
        // Title the stage
        primaryStage.setTitle("ATHENA'S MORTGAGE CALCULATOR");
        // Show window
        primaryStage.show();

    }
}
