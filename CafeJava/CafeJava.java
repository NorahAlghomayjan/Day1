public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println('\n');

    	// ** Your customer interaction print statements will go here ** //

        // Create 3 more drink price variables, for drip coffee, latte and cappuccino following the camel case naming convention.
        int dripPrice = 3;
        int lattePrice = 5;
        double cappuccinoPrice = 2.5;

        // Create 3 more customer variables for Sam, Jimmy and Noah, following the same variable naming convention in the example.
        String[] customers = {"Sam","Jimmy","Noah"};

        // Create the order status flag (true/false) for each customer, following the variable naming convention in the example.



        // For the next tasks, we will be simulating customer interactions, printing messages to the screen, based on scenarios. Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.

        String order = " ,your order is";


        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.

        System.out.println(generalGreeting + customers[2]); 
        System.out.println( customers[2] + order + " cappuccino coffee" );
        System.out.println( displayTotalMessage + cappuccinoPrice);


        boolean isReadyOrder2 = false;
        if (isReadyOrder2)
            {   System.out.println(customers[2] + pendingMessage);}
        else {
            System.out.println( customers[2] + readyMessage );
        }

        System.out.println('\n');

        // Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).

        System.out.println(generalGreeting + customers[0]); 
        System.out.println( customers[0] + order + " 2 lattes" );
        System.out.println( displayTotalMessage + lattePrice * 2);

        boolean isReadyOrder3 = true;
        if (isReadyOrder3)
            {   System.out.println(customers[0] + pendingMessage);
            }
        else {
            System.out.println( customers[0] + readyMessage );
        }

        System.out.println('\n');


        // Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.

        System.out.println(generalGreeting + customers[1]); 
        System.out.println( customers[1] + order + " coffee" );
        System.out.println( displayTotalMessage + dripPrice );

        System.out.println( customers[1] + order + " latte" );
        System.out.println( displayTotalMessage + lattePrice );

        boolean isReadyOrder4 = true;
        if (isReadyOrder3)
            {   System.out.println(customers[1] + pendingMessage);
            }
        else {
            System.out.println( customers[1] + readyMessage );
        }
    }
}