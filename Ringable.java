public interface Ringable {
    default String ring(){
        return (ringTone);
    }
    default String unlock(){
        return ("Unlocked!");
    }
}
