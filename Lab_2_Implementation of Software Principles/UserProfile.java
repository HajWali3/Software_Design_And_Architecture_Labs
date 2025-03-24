import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private int userId;
    private String name;
    private String bio;
    private List<String> posts;
    private List<Integer> followers;
    private List<String> messages; // Messy: Handling user communication here
    private List<String> notifications; // Messy: Handling notifications here

    public UserProfile(int userId, String name, String bio) {
        this.userId = userId;
        this.name = name;
        this.bio = bio;
        this.posts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.notifications = new ArrayList<>();
    }

    // User profile management methods (name, bio, followers)
    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateBio(String newBio) {
        this.bio = newBio;
    }

    public void addFollower(int followerId) {
        followers.add(followerId);
    }

    // Messy methods for messaging (not a profile concern)
    public void sendMessage(int receiverId, String message) {
        // Simulating message sending (should be in a separate Messaging class)
        messages.add("Message to " + receiverId + ": " + message);
    }

    public void displayMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    // Messy methods for notifications (not a profile concern)
    public void addNotification(String notification) {
        notifications.add(notification);
    }

    public void displayNotifications() {
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }
}
