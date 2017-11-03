package sedbury.data;

/**
 * Created by alex on 19/09/2017.
 */
public enum CardClass {

    PRIEST("Priest");

    public String heroType;

    private CardClass(String HeroType){
        this.heroType = heroType;
    }

    public String getName(){
        return this.name();
    }

}
