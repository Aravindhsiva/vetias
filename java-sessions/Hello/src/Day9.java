public class Day9 {

    static class Report {

        static {
            System.out.println("Report is created");
        }

        static void generate(){
            System.out.println("Generating report");
        }
    }

    static void main() {
        Report.generate();
    }
}
