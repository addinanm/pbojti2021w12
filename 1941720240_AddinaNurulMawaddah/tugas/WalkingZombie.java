package tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal(){
        if(level == 1){
            health += (health * 20)/100 ;
        }else if(level == 2){
            health += (health * 30)/100;
        }else if(level == 3){
            health += (health * 40)/100;
        }
    }

    @Override
    public void destroyed(){
        health -= (health * 20)/100;
    }

    @Override
    public String getZombieInfo(){
        String info = "\n Walking Zombie Data =";
        info += super.getZombieInfo();
        return info;
    }
}
