package contract;

public interface IFireball {
  
  /**
     * @param direction
     * Initialize a direction
     */
    void setDirection(MobileOrder direction);

    /**
     * The step is the speed of the fireball
     * @return step : int for number of case the fireball pass
     */
    int getStep();

    /**
     * Method that changes the fireball sprite at each case of the array, so it's multicolour
     */
    void animate();

}
