public class Day7_Poly{
    static class Notification{
        String to;

         void send(){
             System.out.println("Sending notification");
         }
    }

    static class AudioNotification extends Notification{

        @Override
        void send(){
            System.out.println("Sending audio notification");
        }
    }
    static class TextNotification extends Notification{

        @Override
        void send(){
            System.out.println("Sending text notification");
        }
    }
        public static void main(String[] args) {
            AudioNotification audio = new AudioNotification();
            audio.send();
            TextNotification text = new TextNotification();
            text.send();
        }
}