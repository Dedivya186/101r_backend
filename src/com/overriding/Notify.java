package com.overriding;

class Notification {

    void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    void validateReceiver() {
        System.out.println("Validating receiver");
    }

    void sendAttachment() {
        System.out.println("Sending attachment");
    }

    void getDeliveryStatus() {
        System.out.println("Checking delivery status");
    }
}


// Email Notification
class EmailNotification extends Notification {

    @Override
    void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }

    @Override
    void validateReceiver() {
        System.out.println("Email address validated");
    }

    @Override
    void sendAttachment() {
        System.out.println("Email attachment sent");
    }

    @Override
    void getDeliveryStatus() {
        System.out.println("Email delivered successfully");
    }
}


// SMS Notification
class SMSNotification extends Notification {

    @Override
    void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }

    @Override
    void validateReceiver() {
        System.out.println("Mobile number validated");
    }

    @Override
    void sendAttachment() {
        System.out.println("SMS does not support attachments");
    }

    @Override
    void getDeliveryStatus() {
        System.out.println("SMS delivered successfully");
    }
}


// WhatsApp Notification
class WhatsAppNotification extends Notification {

    @Override
    void sendMessage(String message) {
        System.out.println("WhatsApp message sent: " + message);
    }

    @Override
    void validateReceiver() {
        System.out.println("WhatsApp number validated");
    }

    @Override
    void sendAttachment() {
        System.out.println("WhatsApp attachment sent");
    }

    @Override
    void getDeliveryStatus() {
        System.out.println("WhatsApp message delivered");
    }
}


// Main
public class Notify {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();

        email.validateReceiver();
        email.sendMessage("Hello");
        email.sendAttachment();
        email.getDeliveryStatus();

        System.out.println();

        SMSNotification sms = new SMSNotification();

        sms.validateReceiver();
        sms.sendMessage("Your OTP is 1234");
        sms.sendAttachment();
        sms.getDeliveryStatus();

        System.out.println();

        WhatsAppNotification whatsapp = new WhatsAppNotification();

        whatsapp.validateReceiver();
        whatsapp.sendMessage("Hello from WhatsApp");
        whatsapp.sendAttachment();
        whatsapp.getDeliveryStatus();
    }
}