````mermaid
 classDiagram
    class Imobilie {
        #ort: String
        #baujahr: int
        #wohnflaeche: double
        #preis: double
    }
    
    class Wohnung {

    }
    
    class Wohnhaus {
       -grundstuecksfläche: double
    }
    
  <<absract>> Imobilie
    
 Imobilie <|-- Wohnung
 Imobilie <|-- Wohnhaus

````