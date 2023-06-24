import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final String GUITAR = "Guitar";
    private static final String DRUMS = "Drums";
    private static final String BASS = "Bass";
    private static final String PIANO = "Piano";
    private static final String VIOLIN = "Violin";
    private static final String FLUTE = "Flute";
    private static final String TRUMPET = "Trumpet";
    private static final String SAXOPHONE = "Saxophone";
    private static final String TROMBONE = "Trombone";
    private static final String CLARINET = "Clarinet";
    private static final String HARMONICA = "Harmonica";

    public static void main(String[] args) {
        List<BandMember> pinkFloyd = Arrays.asList(
            new BandMember(GUITAR, "David Gilmour"),
            new BandMember(DRUMS, "Nick Mason"),
            new BandMember(BASS, "Roger Waters"),
            new BandMember(PIANO, "Richard Wright"),
            new BandMember(VIOLIN, "Isadora Steen"),
            new BandMember(FLUTE, "Johan van der Linden"),
            new BandMember(TRUMPET, "Johan van der Linden"),
            new BandMember(SAXOPHONE, "Johan van der Linden"),
            new BandMember(TROMBONE, "Johan van der Linden"),
            new BandMember(CLARINET, "Johan van der Linden"),
            new BandMember(HARMONICA, "Johan van der Linden")
        );

        List<BandMember> ironMaiden = Arrays.asList(
            new BandMember(GUITAR, "Dave Murray"),
            new BandMember(DRUMS, "Nicko McBrain"),
            new BandMember(BASS, "Steve Harris"),
            new BandMember(PIANO, "Michael Kenney")
        );

        List<BandMember> blackSabbath = Arrays.asList(
            new BandMember(GUITAR, "Tony Iommi"),
            new BandMember(DRUMS, "Bill Ward"),
            new BandMember(BASS, "Geezer Butler"),
            new BandMember(PIANO, "Adam Wakeman")
        );

        Stream<BandMember> musicians = Stream.concat(
            Stream.concat(pinkFloyd.stream(), ironMaiden.stream()),
            blackSabbath.stream()
        );

        List <String> guitarPlayers = musicians
            .filter(m -> m.getInstrument().equals(GUITAR))
            .map(BandMember::getName)
            .collect(Collectors.toList());

        Stream<BandMember> musicians2 = Stream.concat(
            Stream.concat(pinkFloyd.stream(), ironMaiden.stream()),
            blackSabbath.stream()
        );

        List <String> drummers = musicians2
            .filter(m -> m.getInstrument().equals(DRUMS))
            .map(BandMember::getName)
            .collect(Collectors.toList());

        System.out.println(drummers);

        System.out.println(guitarPlayers);

    }
    static class BandMember {
        private final String instrument;
        private final String name;

        public BandMember(String instrument, String name) {
            this.instrument = instrument;
            this.name = name;
        }

        public String getInstrument() {
            return instrument;
        }

        public String getName() {
            return name;
        }
    }
}