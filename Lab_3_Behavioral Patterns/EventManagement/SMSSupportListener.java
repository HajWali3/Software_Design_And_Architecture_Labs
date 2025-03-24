package EventManagement;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private static final int MAX_SMS_LENGTH = 160;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String defaultSMS = "Your file " + file.getName() + " has been " + eventType + ".";

        if (defaultSMS.length() > MAX_SMS_LENGTH) {
            System.out.println("Warning: SMS exceeds 160 characters. Define a valid SMS.");
        } else {
            sendSMS(phoneNumber, defaultSMS);
        }
    }

    private void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
