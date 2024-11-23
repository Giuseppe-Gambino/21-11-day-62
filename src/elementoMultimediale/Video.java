package elementoMultimediale;

import elementoMultimediale.interfaccia.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }



    @Override
    public void play() {
        System.out.println("video in corso:");
        for (int i = 0; i < durata; i++) {
            System.out.println((i + 1) + "s");
        }
        System.out.println("video in concluso");

    }

    @Override
    public void esegui() {
        play();
    }
}
