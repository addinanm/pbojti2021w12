package tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal(){
        if(level == 1){
            health += (health * 30)/100 ;
        }else if(level == 2){
            health += (health * 40)/100;
        }else if(level == 3){

            health += (health * 50)/100;
        }
    }

    @Override
    public void destroyed(){
        health -= (health * 10)/100 ;
    }

    @Override
    public String getZombieInfo(){
        String info = "\n Jumping Zombie Data =";
        info += super.getZombieInfo();
        return info;
    }
}
