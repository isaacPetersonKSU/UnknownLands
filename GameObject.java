
public class GameObject {
    private int maxHealth;
    private int health;
    //add location stuff later

    public GameObject(int mh){
        maxHealth = mh;
        health = maxHealth;
    }

    //returns true if creature dies
    public boolean hurt(int pts){
        if(pts >= health) return true;
        health -= pts;
        return false;
    }

    public void heal(int pts){
        health += pts;
        if(health > maxHealth) health = maxHealth;
    }
    
    public int getHitPts(){
        return health;
    }

    public int getHitPtsMax(){
        return maxHealth;
    }
}
