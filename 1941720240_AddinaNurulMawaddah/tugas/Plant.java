package tugas;

public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie ){
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        }else if(d instanceof JumpingZombie ){
            JumpingZombie jm = (JumpingZombie) d;
            jm.destroyed();
        }else if(d instanceof Barrier ){
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}
