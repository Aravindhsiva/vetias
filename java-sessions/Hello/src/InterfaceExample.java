public class InterfaceExample {
    interface Notification{
        String send();
    }

    static class EmailNotification implements Notification{

        @Override
        public String send(){
            System.out.println("Sending email");
            return "Sending email";
        }
    }
    static class SMSNotification implements Notification{

        @Override
        public String send(){
            System.out.println("Sending SMS");
            return "Sending SMS";
        }
    }

    static void main() {
        SMSNotification sms = new SMSNotification();
        sms.send();

        EmailNotification email = new EmailNotification();
        email.send();
    }

}
