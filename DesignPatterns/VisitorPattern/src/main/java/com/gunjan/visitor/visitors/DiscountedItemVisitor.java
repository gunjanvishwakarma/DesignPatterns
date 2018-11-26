package com.gunjan.visitor.visitors;

import java.util.List;

import com.gunjan.visitor.structure.DiscountedItem;
import com.gunjan.visitor.structure.GiftItem;
import com.gunjan.visitor.structure.Item;
import com.gunjan.visitor.structure.RegularItem;

public class DiscountedItemVisitor implements ItemVisitor
{
    private int price;
    public int discount;
    
    public int calculate(List<Item> items)
    {
        TotalPriceItemVisitor totalPriceItemVisitor = new TotalPriceItemVisitor();
        totalPriceItemVisitor.calculate(items);
        price = totalPriceItemVisitor.price;
        items.forEach(item -> item.accept(this));
        return discount;
    }
    
    @Override
    public void visitGiftItem(GiftItem giftItem)
    {
        if(price >= giftItem.minimalPriceForGift)
        {
            discount += giftItem.originalPrice;
        }
    }
    
    @Override
    public void visitRegularItem(RegularItem regularItem)
    {
    
    }
    
    @Override
    public void visitDiscountedItem(DiscountedItem discountedItem)
    {
        discount += discountedItem.discountPrice;
    }
}
