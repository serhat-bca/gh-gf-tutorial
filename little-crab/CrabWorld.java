import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm,481,172);
        Worm worm2 = new Worm();
        addObject(worm2,192,152);
        Worm worm3 = new Worm();
        addObject(worm3,39,271);
        Worm worm4 = new Worm();
        addObject(worm4,92,390);
        Worm worm5 = new Worm();
        addObject(worm5,178,488);
        Worm worm6 = new Worm();
        addObject(worm6,405,498);
        Worm worm7 = new Worm();
        addObject(worm7,480,475);
        Worm worm8 = new Worm();
        addObject(worm8,388,369);
        Worm worm9 = new Worm();
        addObject(worm9,398,183);
        Worm worm10 = new Worm();
        addObject(worm10,420,83);
        Worm worm11 = new Worm();
        addObject(worm11,59,45);
        Worm worm12 = new Worm();
        addObject(worm12,113,153);
        Worm worm13 = new Worm();
        addObject(worm13,128,273);
        Worm worm14 = new Worm();
        addObject(worm14,335,275);
        Worm worm15 = new Worm();
        addObject(worm15,436,281);
        Worm worm16 = new Worm();
        addObject(worm16,273,135);
        Worm worm17 = new Worm();
        addObject(worm17,305,50);
        Lobster lobster = new Lobster();
        addObject(lobster,117,488);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,512,71);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,40,23);
        Crab crab = new Crab();
        addObject(crab,325,322);
        Crab crab2 = new Crab();
        addObject(crab2,116,331);
    }
}