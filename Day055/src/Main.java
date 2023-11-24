import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Musician steveHarris = new Musician("Steve Harris", "Bass", "England", "Iron Maiden");
        Musician michaelSchenker = new Musician("Michael Schenker", "Guitar", "Germany", "UFO");
        Musician daveLombardo = new Musician("Dave Lombardo", "Drums", "Cuba", "Slayer");

        List<Musician> musicians = List.of(steveHarris, michaelSchenker, daveLombardo);

        try (Jsonb jsonb = JsonbBuilder.create()) {
            String json = jsonb.toJson(musicians);
            System.out.println(json);

            String jsonJohnLord = "{\"bandName\":\"Deep Purple\",\"country\":\"England\",\"instrument\":\"Keyboards\",\"name\":\"John Lord\"}";

            Musician johnLord = jsonb.fromJson(jsonJohnLord, Musician.class);

            System.out.println(johnLord);
        }
    }

    public static class Musician {
        private String name;
        private String instrument;
        private String country;
        private String bandName;

        public Musician() {
        }

        public Musician(String name, String instrument, String country, String bandName) {
            this.name = name;
            this.instrument = instrument;
            this.country = country;
            this.bandName = bandName;
        }

        // Getters and setters...

        @Override
        public String toString() {
            return "Musician{" +
                    "name='" + name + '\'' +
                    ", instrument='" + instrument + '\'' +
                    ", country='" + country + '\'' +
                    ", bandName='" + bandName + '\'' +
                    '}';
        }
    }
}