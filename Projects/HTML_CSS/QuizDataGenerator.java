import java.io.FileWriter;
import java.io.IOException;

public class QuizDataGenerator {
    public static void main(String[] args) {
        String jsonData = """
            [
                {"question": "What is the capital of France?", "options": ["Paris", "London", "Berlin"], "answer": "Paris"},
                {"question": "What is 2 + 2?", "options": ["3", "4", "5"], "answer": "4"},
                {"question": "What is the color of the sky?", "options": ["Blue", "Green", "Red"], "answer": "Blue"}
                { question: "What is 5 x 5?", options: ["20", "25", "30"], answer: "25" },
                { question: "Which planet is known as the Red Planet?", options: ["Earth", "Mars", "Jupiter"], answer: "Mars" },
                { question: "What is the boiling point of water?", options: ["90°C", "100°C", "110°C"], answer: "100°C" },
                { question: "Who wrote 'Hamlet'?", options: ["Shakespeare", "Dickens", "Twain"], answer: "Shakespeare" },
                { question: "What is the square root of 16?", options: ["3", "4", "5"], answer: "4" },
                { question: "What is the largest ocean on Earth?", options: ["Atlantic", "Indian", "Pacific"], answer: "Pacific" },
                { question: "What is 10 / 2?", options: ["4", "5", "6"], answer: "5" }
            ]
        """;

        try (FileWriter file = new FileWriter("quiz-data.json")) {
            file.write(jsonData);
            System.out.println("Quiz data successfully written to quiz-data.json");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
