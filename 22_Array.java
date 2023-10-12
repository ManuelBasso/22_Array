/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e che che calcoli la
somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */

public class Main {
    public static void main(String args[]) {
        SumNum();
    }

    public static void SumNum(){
        int somma = 0;
        int[] arrNumbers = new int[10];     //Creo array con spazio per 10 elementi
        for (int i=0; i<10; i++){           //Aggiungo all'array i numeri da 1 a 10 tramite ciclo for
            arrNumbers[i] = i+1;
            somma += arrNumbers[i];         //sommo il valore alla variabile somma, che a fine ciclo restituirà la somma di tutti i numeri dell'array
        }
        System.out.println("Somma di tutti valori nell'array = "+ somma);
    }
}