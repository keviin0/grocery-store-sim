import java.util.ArrayList;

public class shoppingCart
{
  public String mUserName;
  public static ArrayList mMyList = new ArrayList(20);

  public shoppingCart(itemName, myList)
  {
    mUserName = name;
    mMyList = myList;

  }

  public removeItem(name)
  {
    for (int count = 0; count < shoppingCart.mMyList.length; count++) 
    {
      // add each element to sum
      if mList[count] == name
      {
        mMyList.remove(count);
        break; 
      }
    }
  }
  public removeItem(name)
  {
    mMyList.add(name);
  }

  public displayItems()
  {
    for(int count = 0; count < shoppingCart.mMyList.length; count ++)
    {
      System.out.println(mMyList(count));
    }
  }


}