import java.io.FileWriter;
import java.io.IOException;

public class SportsDayWebPage {
    public static void main(String[] args) {
        String htmlContent = """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Sports Day Event</title>
            <style>
                body { font-family: Arial, sans-serif; background: #f2f2f2; margin: 0; padding: 0; }
                .header { background: #2196F3; color: #fff; padding: 30px 0; text-align: center; }
                .container { max-width: 900px; margin: 30px auto; background: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px #ccc; }
                h1, h2 { margin: 10px 0;}
                ul { list-style: none; padding: 0;}
                li { margin: 10px 0; }
                .footer { background: #2196F3; color: #fff; padding: 10px 0; text-align: center; position: fixed; width: 100%; bottom: 0;}
            </style>
        </head>
        <body>
            <div class="header">
                <h1>Welcome to Sports Day!</h1>
                <p>Join us for a day of fun, fitness, and friendly competition.</p>
            </div>
            <div class="container">
                <h2>Event Details</h2>
                <ul>
                    <li><strong>Date:</strong> September 25, 2025</li>
                    <li><strong>Time:</strong> 9:00 AM - 5:00 PM</li>
                    <li><strong>Venue:</strong> School Main Ground</li>
                </ul>
                <h2>Activities</h2>
                <ul>
                    <li>100m Sprint</li>
                    <li>Long Jump</li>
                    <li>Relay Race</li>
                    <li>Football Match</li>
                    <li>Cricket Tournament</li>
                    <li>Badminton</li>
                </ul>
                <h2>Instructions</h2>
                <ul>
                    <li>Wear comfortable sports attire.</li>
                    <li>Bring your water bottle and energy!</li>
                    <li>All students must report by 8:30 AM.</li>
                </ul>
            </div>
            <div class="footer">
                &copy; 2025 Sports Day Committee
            </div>
        </body>
        </html>
        """;

        try (FileWriter writer = new FileWriter("sportsday.html")) {
            writer.write(htmlContent);
            System.out.println("Webpage 'sportsday.html' created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating webpage: " + e.getMessage());
        }
    }
}