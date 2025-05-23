//ESERCIZIO SU EREDITARIETÀ E POLIMORFISMO

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Ogni classe va definita nel suo file java.
// Per comodità, solo per motivi didattici, definiamo tutte le classi 
//  nella classe Esercizio
class Esercizio {

    class Persona {
        public String nome;
        
        public Persona(String nomeP){
            this.nome = nomeP;
        }
        public void saluta(){
            System.out.print("Ciao sono "+nome+"!");
        }
    }

    class Sportivo extends Persona {
        public String sport;
        public Sportivo(String nomeP, String sportP){
            super(nomeP);
            this.sport=sportP; 
        }

    }

    class Calciatore extends Sportivo {
        public String squadra;
        public String ruolo;
        public Calciatore(String nomeP, String squadraP, String ruoloP){
            super(nomeP,"Calcio");
            this.squadra = squadraP;
            this.ruolo = ruoloP;
        }
        public void segnaGoal(){
            System.out.print(nome+" ha segnato un goal per "+squadra+"!");
        }
    }

    class Tennista extends Sportivo {
        public int ranking;
        public Tennista(String nomeP, int rankingP){
            super(nomeP,"Tennis");
            this.ranking = rankingP; 
        }
        public void scaleMondiale(){
            System.out.print(nome+" è al "+ranking+"° posto nel ranking mondiale!");
        }
    }


    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        String nome;
        Scanner in = new Scanner( System.in );
        System.out.print("Inserisci il tuo nome: ");
        nome = in.nextLine();
        System.out.println("Ciao "+nome+"!");
    }
}

