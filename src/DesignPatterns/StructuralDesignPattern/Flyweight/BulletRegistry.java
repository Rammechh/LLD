package DesignPatterns.StructuralDesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {

    private Map<BulletType, Bullet> bulletsMap =   new HashMap<>();
    public void register(BulletType type, Bullet b){
        bulletsMap.put(type, b);
    }

    public Bullet  getBullet(BulletType type){
        return bulletsMap.get(type);
    }

}

