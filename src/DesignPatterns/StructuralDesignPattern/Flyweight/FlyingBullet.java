package DesignPatterns.StructuralDesignPattern.Flyweight;

public class FlyingBullet {

    Bullet bullet;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(int current_speed) {
        this.current_speed = current_speed;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCurrent_position_x() {
        return current_position_x;
    }

    public void setCurrent_position_x(int current_position_x) {
        this.current_position_x = current_position_x;
    }

    public int getCurrent_position_y() {
        return current_position_y;
    }

    public void setCurrent_position_y(int current_position_y) {
        this.current_position_y = current_position_y;
    }

    public int getCurrent_position_z() {
        return current_position_z;
    }

    public void setCurrent_position_z(int current_position_z) {
        this.current_position_z = current_position_z;
    }

    int direction;
    int current_speed;
    int user_id;
    int current_position_x;
    int current_position_y;
    int current_position_z;

    FlyingBullet (Bullet bullet){
        this.bullet = bullet;
    }

}
