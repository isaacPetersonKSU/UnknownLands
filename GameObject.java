import java.util.*;

public class GameObject {
    private int maxHealth;
    private int health;
    private int weight;
    private int inventoryWeight;
    private int capacity;
    private LinkedList<GameObject> inventory;
    //add location stuff later

    public GameObject(int mh, int wt, int cap){
        maxHealth = mh;
        health = maxHealth;
        weight = wt;
        inventoryWeight = 0;
        capacity = cap;
        inventory = new LinkedList<GameObject>();
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

    public int getWeight(){
        return weight + inventoryWeight;
    }

    public boolean Store(GameObject obj){
        if(capacity >= obj.getWeight() + inventoryWeight){
            inventory.add(obj);
            inventoryWeight += obj.getWeight();
            return true;
        }
        else return false;
    }

    public GameObject Remove(int index){
        GameObject obj = inventory.remove(index);
        inventoryWeight -= obj.getWeight();
        return obj;
    }

    
}
