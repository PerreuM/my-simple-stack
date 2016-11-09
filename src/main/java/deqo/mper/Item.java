package deqo.mper;

/**
 * Created by MarieP on 08/11/2016.
 */
public class Item {
    private Object value;

    /*
    * un commentaire répondant à l'exigence #1
    */
    Item (Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
