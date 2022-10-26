package Lesson5;

public class Rect {
    private int s;
    private int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}

