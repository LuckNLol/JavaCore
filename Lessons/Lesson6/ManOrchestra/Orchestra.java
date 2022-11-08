package Lesson6.ManOrchestra;
import java.util.List;

public class Orchestra {
    private List<Musician> musicians;

    public Orchestra(List<Musician> musicians) {
        this.musicians = musicians;
    }


    public void addMusician(Musician m) {
        this.musicians.add(m);
    }

    public void play() {
        for(Musician m : musicians) {
            m.play();
        }
        // или иная запись функционального интерфейса:
        //musicians.forEach(Musician::play);
    }
}
