package strings_two;

// An online shopping platform collects customer feedback after every purchase. The management wants to know 
// whether a feedback message contains positive words such as good, excellent, awesome, or great. Write a program
// that accepts customer.


public class Shopping {
    public static void main(String[] args) {
        String feedback = "The product is excellent and the service was great!";
        String[] positiveWords = {"good", "excellent", "awesome", "great"};

        boolean PositiveFeedback = false;
        for (String word : positiveWords) {
            if (feedback.toLowerCase().contains(word)) {
                PositiveFeedback = true;
                break;
            }
        }
        System.out.println("Feedback contains positive words: " + PositiveFeedback);
    }
}
