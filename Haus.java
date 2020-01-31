
/**
 * Erstellt ein Haus aus vorgegebenen geometrischen Formen
 * 
 * @author Lukas Breuer 
 * @version 12.09.2019
 */
public class Haus
{

    public Quadrat wand;
    public Quadrat fensterR;
    public Quadrat fensterL;
    public Dreieck dach;
    public Kreis sonne;
    private boolean istSichtbar;
    
    public Haus()
    {
        erstelleWand();
        erstelleFenster();
        erstelleDach();
        erstelleSonne();
        istSichtbar = false;
    }
    
    //erstellt die Verschiedenen Formen für das Haus
    private void erstelleWand()
    {
        wand = new Quadrat();
        wand.groesseAendern(50);
        wand.vertikalBewegen(200);
        wand.horizontalBewegen(-50);
        wand.farbeAendern("rot");
    }
    
    private void erstelleFenster()
    {
        //rechtes Fenster
        fensterR = new Quadrat();
        fensterR.groesseAendern(10);
        fensterR.vertikalBewegen(220);
        fensterR.horizontalBewegen(-20);
        fensterR.farbeAendern("blau");
        
        //linkes Fenster
        fensterL = new Quadrat();
        fensterL.groesseAendern(10);
        fensterL.vertikalBewegen(220);
        fensterL.horizontalBewegen(-40);
        fensterL.farbeAendern("blau");
    }
    
    private void erstelleDach()
    {
        dach = new Dreieck();
        dach.groesseAendern(40, 60);
        dach.vertikalBewegen(195);
        dach.horizontalBewegen(-15);
        dach.farbeAendern("schwarz");
    }
    
    private void erstelleSonne()
    {
        sonne = new Kreis();
        sonne.groesseAendern(50);
        sonne.vertikalBewegen(-50);
        sonne.horizontalBewegen(-15);
        sonne.farbeAendern("gelb");
    }
    
    //macht die Formen sichtbar
    public void macheSichtbar()
    {
         wand.sichtbarMachen();
         fensterR.sichtbarMachen();
         fensterL.sichtbarMachen();
         dach.sichtbarMachen();
         sonne.sichtbarMachen();
    }
    
    //macht die Formen unsichtbar
    public void macheUnsichtbar()
    {
        wand.unsichtbarMachen();
        fensterR.unsichtbarMachen();
        fensterL.unsichtbarMachen();
        dach.unsichtbarMachen();
        sonne.unsichtbarMachen();
    }
}