public class Creature extends GameObject {
    private int stamina;
    private int maxStamina;

    public Creature(int mxHel, int mxStm){
        super(mxHel);
        maxStamina = mxStm;
        stamina = mxStm;
    }
}
