package com.personage.gmall.user.controller;

import java.util.Random;

/**
 * @BelongsProject: gmall
 * @BelongsPackage: com.personage.gmall.user.controller
 * @CreateTime: 2020-11-10 21:40
 * @Description:
 */

public class RandomPeople {
    public static void main(String[] args) {
        Random col = new Random();
        Random row = new Random();
        int lie = col.nextInt(5)+1;
        int hang = row.nextInt(4)+1;
        System.out.println("第几列"+lie+"第几行"+hang);
    }
}
