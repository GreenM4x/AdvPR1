package de.gds2.pr1_x280_x290_Vererbung.Interface;

public interface NachrichtenQuelle {
    // Interessierte können sich bei der Quelle anmelden
// (falls sie noch nicht angemeldet sind)
    public void anmelden(Vermittler empf);
    // Angemeldete können sich bei der Quelle wieder abmelden
    // (falls sie angemeldet sind)
    public void abmelden(Vermittler empf);
    // neue Nachricht wird an alle angemeldeten
    // Empfaenger uebergeben
    // (Aufruf deren Methode empfangeNachricht)
    public void sendeNachricht(String nachricht);
}
