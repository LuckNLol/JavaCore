package Lesson6.Battle;

public class Player extends Human {

    class Backpack {
        private String staff = "";

        void put(String things) {
            staff += things + ",";
        }

        public String toString() {
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.length() - 1) + "in the backpack";
        }
    }

    Backpack backpack;

    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String thing) {
        backpack.put(thing);
    }
}

