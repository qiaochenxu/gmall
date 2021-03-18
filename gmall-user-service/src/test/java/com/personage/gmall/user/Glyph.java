package com.personage.gmall.user;

/**
 * @BelongsProject: gmall
 * @BelongsPackage: com.personage.gmall.user
 * @CreateTime: 2021-03-15 13:58
 * @Description:
 */

public class Glyph {
    void draw(){
        System.out.println("Glyph.draw");
    }
    Glyph(){
        System.out.println("Glyph() before");
        draw();
        System.out.println("Glyph() after");
    }

    public static void main(String[] args) {
        new Roound(5);
    }
}
class Roound extends Glyph{
    private int radius=1;
    Roound(int r){
        radius=r;
        System.out.println("Roound() ,radius="+radius);
    }
    @Override
    void draw() {
        System.out.println("Roound().draw(),radius="+radius);
    }
}
