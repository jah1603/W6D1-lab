public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner)

    {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.toner;
    }


    public void print(int pages, int copies) {
        int pagesToPrint = pages * copies;
        if (this.sheets >= pagesToPrint && this.toner >= pagesToPrint) {
            this.sheets -= (pages * copies);
            reduceToner(pagesToPrint);
        }
    }

    public void reduceToner(int numberOfCopies) {
        this.toner -= numberOfCopies;
    }

    public void realPrint(int pages, int copies) {
        print(pages, copies);
    }
}


