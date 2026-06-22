public class Day14_Adapter {

    interface NewPrinter {
        void print(String text);
    }

    static class OldPrinter {
        void printText(String text) {
            System.out.println("OLD Printer : "+text);
        }
    }

    static class OldPrinterAdapter implements NewPrinter {
        private final OldPrinter printer;
        OldPrinterAdapter(OldPrinter printer) {
            this.printer = printer;
        }

        @Override
        public void print(String text){
            printer.printText(text);
        }
    }

    static void main() {
        NewPrinter printer = new OldPrinterAdapter(new OldPrinter());
        printer.print("Hello World");
    }
}
