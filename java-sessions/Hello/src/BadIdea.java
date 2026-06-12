public class BadIdea {

    class AudioNotification{
        String to;

        void validateTo(String to){
            // this.to = to.strip();
            System.out.println("Validating the to field:  "+to);
        }

        void send(){
            System.out.println("Sending notification");
        }
    }

    class TextNotification {
        String to;

        void validateTo(String to){
            System.out.println("Validating the to field:  "+to);
        }

        void send(){
            System.out.println("Sending notification");
        }
    }

    static void main() {

    }
}
