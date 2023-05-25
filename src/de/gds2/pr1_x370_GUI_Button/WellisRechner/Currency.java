package de.gds2.pr1_x370_GUI_Button.WellisRechner;

public enum Currency {
    DOLLART(1.10), YEN(0.0068), POUND(1.14), BATH(0.027);

    private final double vallue;

    Currency(double vallue) {
        this.vallue = vallue;
    }

    public double Getvallue () {
        return this.vallue;
    }
}
