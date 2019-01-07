//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int _key = 1234;
   private boolean _isLocked = false;
   private int face;
   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      //flip();
   }
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public boolean flip ()
   {
      if(isLocked()) {
          System.out.println("Cannot flip coin: coin is locked.");
          return false;
      }
      face = (int) (Math.random() * 2);
      return true;
   }
   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }
   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
   }
   
    private boolean isValid(int key) {
        return key == _key;
    }
    public void lock(int key) {
        if(isValid(key)) {
           _isLocked = true; 
        }
    }

    public void unlock(int key) {
        if(isValid(key)) {
            _isLocked = false;
        }
    }

    public void setKey(int key) {
        _key = key;
        System.out.println("Key set.");
    }

    public boolean isLocked() {
        return _isLocked;
    }
}