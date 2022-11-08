package Lesson6.ManOrchestra;

public class Singer implements Musician{
    private final String name;

    public Singer(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Всем привет, меня зовут " + name + ", поехали!");
    }

    @Override
    public void play() {
        System.out.println("Весь в пухуу-яя, в пу-ху-яяяя ");
    }
}
