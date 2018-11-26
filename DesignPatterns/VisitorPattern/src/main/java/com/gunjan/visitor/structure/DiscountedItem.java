package com.gunjan.visitor.structure;


import com.gunjan.visitor.visitors.ItemVisitor;

public class DiscountedItem implements Item
{
    public int originalPrice;
    public int discountPrice;
    
    public DiscountedItem(int originalPrice, int discountPrice)
    {
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
    }
    
    @Override
    public boolean accept(ItemVisitor itemVisitor)
    {
        itemVisitor.visitDiscountedItem(this);
        return true;
    }
}
