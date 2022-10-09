/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    // The color of this bag
    private String color;
    // the number of items currently in this bag
    private int numberOfContents;
    // the number of items this bag can hold
    private int capacity;
    // The contents of this bag
    private String[] contents;


    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * Creates a new bag.
     *
     * @param color    the color of this monster.
     * @param capacity the capacity of this monster.
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.numberOfContents = 0;
        this.capacity = capacity;
        this.contents = new String[capacity];

    }



    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /**
     * @return the color of this bag.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return the number of items in this bag.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * @return the capacity of this bag.
     */
    public int getCapacity() {
        return this.capacity;
    }
    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /**
     * Sets the color of this bag to the given color.
     *
     * @param color the color to set this bag to.
     */
    public void setColor(String color) {
        this.color = color;
    }





    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /**
     * Adds item to bag. If the bag is full, do nothing.
     *
     * @param item item to be added to bag.
     * @return true if item was added to the bag, false otherwise.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents == this.capacity) {
            return false;
        } else {
            this.contents[numberOfContents] = item;
            this.numberOfContents += 1;
            return true;
        }
    }

    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     * <p>
     * If there are no items in this Bag, return null.
     *
     * @return the last item added to this bag
     */


    public String popItem() {
        if (this.numberOfContents == 0) {
            return null;
        } else {
            this.numberOfContents -= 1;
            String return_value = this.contents[numberOfContents];
            this.contents[numberOfContents] = null;
            return return_value;
        }

    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.

        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the details of this bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}