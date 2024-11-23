
import elementoMultimediale.*;

import java.util.Scanner;

public class MediaPlayer {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci quanti elementi multimediali vuoi registrare:(5)");
            int sceltaQuantitaElementi = scanner.nextInt();

            ElementoMultimediale[] elementi = new ElementoMultimediale[sceltaQuantitaElementi];

            // Creazione degli elementi multimediali
            for (int i = 0; i < sceltaQuantitaElementi; i++) {
                System.out.println("Inserisci il tipo di elemento (1=Immagine, 2=Audio, 3=Video):");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Inserisci il titolo:");
                String titolo = scanner.nextLine();

                if (tipo == 1) { // Immagine
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                } else if (tipo == 2) { // Registrazione Audio
                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
                } else if (tipo == 3) { // Video
                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                }
            }


            int scelta;
            do {
                System.out.println("Inserisci il numero dell'elemento da eseguire (1-5) o 0 per uscire:");
                scelta = scanner.nextInt();
                if (scelta >= 1 && scelta <= 5) {
                    elementi[scelta - 1].esegui();
                }
            } while (scelta != 0);

            scanner.close();
        }
}