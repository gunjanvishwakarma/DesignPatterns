import java.util.ArrayList;
import java.util.List;

import com.gunjan.visitor.structure.DiscountedItem;
import com.gunjan.visitor.structure.GiftItem;
import com.gunjan.visitor.structure.Item;
import com.gunjan.visitor.structure.RegularItem;
import com.gunjan.visitor.visitors.DiscountedItemVisitor;
import com.gunjan.visitor.visitors.TotalPriceItemVisitor;

public class ItemItemVisitorTest
{
    public static void main(String[] args)
    {
        List<Item> items = new ArrayList<>();
        items.add(new RegularItem(10));
        items.add(new GiftItem(11, 3));
        items.add(new DiscountedItem(4, 2));
        
        System.out.println("Total Price = " + new TotalPriceItemVisitor().calculate(items));
        System.out.println("Total Discount = " + new DiscountedItemVisitor().calculate(items));
    }
}