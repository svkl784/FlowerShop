package domain.interfaces;

public interface FlowersService {
    void grow();
    default void beautifulFlowers(){
        System.out.println("Аll flowers are beautiful!");
    }
}
