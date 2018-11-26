package com.gunjan.visitor.visitors;


import java.util.List;

import com.gunjan.visitor.structure.DiscountedItem;
import com.gunjan.visitor.structure.GiftItem;
import com.gunjan.visitor.structure.Item;
import com.gunjan.visitor.structure.RegularItem;

public class TotalPriceItemVisitor implements ItemVisitor
{
    public int price;
    
    public int calculate(List<Item> items)
    {
        items.forEach(item -> item.accept(this));
        return price;
    }
    
    @Override
    public void visitGiftItem(GiftItem item)
    {
    }
    
    @Override
    public void visitRegularItem(RegularItem item)
    {
        this.price += item.price;
    }
    
    @Override
    public void visitDiscountedItem(DiscountedItem item)
    {
        this.price += item.originalPrice - item.discountPrice;
    }
}
