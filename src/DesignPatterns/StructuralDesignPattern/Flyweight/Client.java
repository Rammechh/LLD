package DesignPatterns.StructuralDesignPattern.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //In scaler refer Day 107 : LLD 5: BEHAVIOURAL DESIGN PATTERNS

    private static List<FlyingBullet> flyingBulletList = new ArrayList<>();
    private static BulletRegistry bulletRegistry = new BulletRegistry();

    public static void main(String[] args) {
        Bullet b = new Bullet();
        b.caliber = 9.0f;
        bulletRegistry.register(BulletType.T9,b);

        b = new Bullet();
        b.caliber = 7.62f;
        bulletRegistry.register(BulletType.T7_62, b);

        b = new Bullet();
        b.caliber = 5.56f;
        bulletRegistry.register(BulletType.T5_56, b);

        for(int i=0; i< 30; i++){
            FlyingBullet flyingBullet = new FlyingBullet(bulletRegistry.getBullet(BulletType.T7_62));
            flyingBulletList.add(flyingBullet);
        }

        for(int i=0; i< 30; i++){
            FlyingBullet flyingBullet = new FlyingBullet(bulletRegistry.getBullet(BulletType.T5_56));
            flyingBulletList.add(flyingBullet);
        }

        for(int i=0; i< 30; i++){
            FlyingBullet flyingBullet = new FlyingBullet(bulletRegistry.getBullet(BulletType.T9));
            flyingBulletList.add(flyingBullet);
        }
    }
}
