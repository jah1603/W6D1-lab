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


    public int print() {
        this.toner = this.sheets;
        int pages = 7;
        int copies = 3;
        if (this.sheets >= (pages * copies)) {
            return (this.sheets -= (pages * copies));
        }else {
            return sheets;
        }
    }

    public int toner() {
        int pages = 7;
        int copies =3;
        if (this.sheets >= (pages * copies)) {
            return (this.toner -= (pages * copies));
        }else {
            return toner;
        }
    }
}

