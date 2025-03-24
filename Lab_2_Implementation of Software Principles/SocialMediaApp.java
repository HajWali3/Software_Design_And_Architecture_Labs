// UserProfile class focuses only on user-related data

import java.util.ArrayList;
import java.util.List;

class UserProfile {
    private int userId;
    private String name;
    private String bio;
    private List<String> posts;
    private List<Integer> followers;

    public UserProfile(int userId, String name, String bio) {
        this.userId = userId;
        this.name = name;
        this.bio = bio;
        this.posts = new ArrayList<>();
        this.followers = new ArrayList<>();
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateBio(String newBio) {
        this.bio = newBio;
    }

    public void addFollower(int followerId) {
        followers.add(followerId);
    }

    public String getProfile() {
        return "User ID: " + userId + "\n" + "Name: " + name + "\n" + "Bio: " + bio;
    }
}

// Messaging class handles user-to-user communication
class Messaging {
    private List<String> messages;

    public Messaging() {
        this.messages = new ArrayList<>();
    }

    public void sendMessage(UserProfile sender, UserProfile receiver, String message) {
        String msg = "Message from " + sender.getProfile() + " to " + receiver.getProfile() + ": " + message;
        messages.add(msg);
        System.out.println("Message Sent: " + msg);
    }

    public void displayMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}

// Notification class handles user notifications (e.g., new followers)
class Notification {
    private List<String> notifications;

    public Notification() {
        this.notifications = new ArrayList<>();
    }

    public void addNotification(UserProfile user, String notificationMessage) {
        String notification = "Notification for " + user.getProfile() + ": " + notificationMessage;
        notifications.add(notification);
        System.out.println(notification);
    }

    public void displayNotifications() {
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }
}

// Main class to test the refactored system
public class SocialMediaApp {
    public static void main(String[] args) {
        // Creating user profiles
        UserProfile alice = new UserProfile(1, "Alice", "Photographer and Traveler");
        UserProfile bob = new UserProfile(2, "Bob", "Tech Enthusiast");

        // Creating Messaging and Notification instances
        Messaging messaging = new Messaging();
        Notification notification = new Notification();

        // Sending messages
        messaging.sendMessage(alice, bob, "Hey Bob, how's it going?");
        messaging.sendMessage(bob, alice, "Hi Alice, just working on a new project!");

        // Adding notifications
        notification.addNotification(alice, "You have a new follower: Bob");
        notification.addNotification(bob, "You have a new follower: Alice");

        // Displaying messages and notifications
        messaging.displayMessages();
        notification.displayNotifications();
    }
}
