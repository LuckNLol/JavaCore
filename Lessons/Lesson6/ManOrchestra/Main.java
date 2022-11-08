package Lesson6.ManOrchestra;
import java.util.List;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        List<Musician> musicians = new LinkedList<>();

        musicians.add(new Guitar());
        musicians.add(new Violin());

        Orchestra orchestra = new Orchestra(musicians);
        orchestra.addMusician(new Drum());
        orchestra.addMusician(new Bass());
        orchestra.addMusician(new Piano());

        Singer singer = new Singer("Эдуард Суровый");
        singer.greet();
        orchestra.addMusician(singer);


        orchestra.play();


    }
}
