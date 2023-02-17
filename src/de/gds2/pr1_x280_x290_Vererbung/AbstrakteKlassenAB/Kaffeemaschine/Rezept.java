package de.gds2.pr1_x280_x290_Vererbung.AbstrakteKlassenAB.Kaffeemaschine;

public enum Rezept {

    KAFFEESCHWARZ(0.2,0.02,0,0,0),
    KAFFEEZUCKER(0.2,0.02,0,0.02,0),
    KAFFEEMILCH(0.2,0.02,0,0,0.02),
    KAFFEEMILCHZUCKER(0.2,0.02,0,0.02,0.02),
    KAKAO(0.2,0,0.02,0.02,0.02);

    private final double wasser;
    private final double kaffe;
    private final double kakao;
    private final double zucker;
    private final double milch;

    Rezept(double wasser, double kaffe, double kakao, double zucker, double milch) {
        this.wasser = wasser;
        this.kaffe = kaffe;
        this.kakao = kakao;
        this.zucker = zucker;
        this.milch = milch;
    }

    public double getWasser() {
        return wasser;
    }

    public double getKaffe() {
        return kaffe;
    }

    public double getKakao() {
        return kakao;
    }

    public double getZucker() {
        return zucker;
    }

    public double getMilch() {
        return milch;
    }
}
