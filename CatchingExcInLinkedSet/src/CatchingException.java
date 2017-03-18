import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Leon Kostyushko on 18.03.2017.
 */
class CatchingException {
    public static void main(String[] args) throws ElementNameIsNotAllowedException{
        Set set = new LinkedHashSet<String>();

        String line = new String();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(line)) throw new ElementNameIsNotAllowedException("Такой элемент уже есть в множестве");
        }
    }
}

class ElementNameIsNotAllowedException extends Exception{
    private final String message;

    public String getMessage() {
        return message;
    }

    public ElementNameIsNotAllowedException(String message) {
        this.message = message;
    }
}
