//ESERCIZIO SU EREDITARIETÀ E POLIMORFISMO

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Ogni classe va definita nel suo file java.
// Per comodità, solo per motivi didattici, definiamo tutte le classi in un unico file, nella classe Esercizio
class Lezione {

    //Uso static class solo perchè in questo caso sto usando classi "innestate" per comodità didattica.
    // Normalmente non si antepone static davanti ad una classe.
    static class Persona {
        public String nome;
        
        public Persona(String nomeP){
            this.nome = nomeP;
        }
        public void saluta(){
            System.out.println("Ciao sono "+nome+"!");
        }
    }

    static class Sportivo extends Persona {
        public String sport;
        public Sportivo(String nomeP, String sportP){
            super(nomeP);
            this.sport=sportP; 
        }

    }

    static class Calciatore extends Sportivo {
        public String squadra;
        public String ruolo;
        public Calciatore(String nomeP, String squadraP, String ruoloP){
            super(nomeP,"Calcio");
            this.squadra = squadraP;
            this.ruolo = ruoloP;
        }
        public void segnaGoal(){
            System.out.println(nome+" ha segnato un goal per "+squadra+"!");
        }
    }

    static class Tennista extends Sportivo {
        public int ranking;
        public Tennista(String nomeP, int rankingP){
            super(nomeP,"Tennis");
            this.ranking = rankingP; 
        }
        public void scaleMondiale(){
            System.out.println(nome+" è al "+ranking+"° posto nel ranking mondiale!");
        }
    }


    // Il programma parte con una chiamata a main().
    public static void main(String args[]) {

        Persona francesco = new Persona("Francesco");
        francesco.saluta();

        //Errore: segnaGoal non è un messaggio che posso inviare (o un metodo che posso invocare) 
        //        ad un oggetto di classe Persona (o una istanza di Persona).
        //francesco.segnaGoal();

        Calciatore giovanni = new Calciatore("Giovanni", "Napoli", "Centrocampista");
        giovanni.saluta();
        giovanni.segnaGoal();
        

    }
}

