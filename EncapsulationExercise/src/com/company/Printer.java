package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel>-1 ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount<=0 || tonerAmount > 100) return -1;
        if(tonerAmount + tonerLevel <= 100) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint;

        if(duplex) {
            pagesToPrint = pages / 2 + pages % 2;
        } else {
            pagesToPrint = pages;
        }

        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
