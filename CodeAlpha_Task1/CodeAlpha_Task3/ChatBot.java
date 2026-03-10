import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Hello! I am a simple AI Chatbot.");
        System.out.println("Type 'exit' to stop the chat.");

        while (true) {

            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("hello") || userInput.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (userInput.contains("name")) {
                System.out.println("Bot: I am CodeAlpha ChatBot.");
            }
            else if (userInput.contains("java")) {
                System.out.println("Bot: Java is a powerful programming language!");
            }
            else if (userInput.contains("bye") || userInput.equals("exit")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}
