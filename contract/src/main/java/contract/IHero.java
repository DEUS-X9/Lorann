package contract;

public interface IHero extends IMobile {
  /**
     * @author pierre fleury
     * @param order from the user
     * @param tileMap check elements permeability and size map
     * @param view
     */
    void move(MobileOrder order, IElement[][] tileMap, IView view);

}
