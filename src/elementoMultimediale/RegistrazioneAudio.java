package elementoMultimediale;


import elementoMultimediale.interfaccia.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
        private int durata;
        private int volume;

        public RegistrazioneAudio(String titolo, int durata, int volume) {
            super(titolo);
            this.durata = durata;
            this.volume = volume;
        }


        public void alzaVolume() {
            volume++;
        }

        public void abbassaVolume() {
            if (volume > 0) volume--;
        }


        @Override
        public void play() {
            System.out.println("audio in corso:");
            for (int i = 0; i < durata; i++) {
                System.out.println((i + 1) + "s");
            }
            System.out.println("audio in concluso");
            System.out.println(titolo + " volume:" + "+".repeat(volume));
        }

        @Override
        public void esegui() {
            play();
        }
    }

