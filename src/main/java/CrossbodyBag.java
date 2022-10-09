/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
public class CrossbodyBag extends Bag {

    // the number of straps of the CrossbodyBag
    private int numStraps;

    /**
     * Creates a new CrossbodyBag.
     *
     * @param color     the color of the CrossbodyBag.
     * @param capacity  the capacity of the CrossbodyBag.
     * @param numStraps the number of straps of the CrossbodyBag.
     */
    public CrossbodyBag(String color, int capacity, int numStraps) {

        super(color, capacity);
        this.numStraps = numStraps;
    }

    /**
     * @return the number of straps of the CrossbodyBag.
     */
    public int getNumberOfStraps() {
        return this.numStraps;
    }

    /**
     * Return the details of this CrossbodyBag.
     *
     * @return the details of this CrossbodyBag.
     */
    @Override
    public String toString() {
        return this.getColor() + " Crossbody Bag with " + this.numStraps + " straps (" + this.getNumberOfContents() + " / " +
                this.getCapacity() + ")";
    }

    /**
     * Increase the capacity of this CrossbodyBag by 2.
     */
    @Override
    public void enhance() {
        this.increaseCapacity(2);

    }
}