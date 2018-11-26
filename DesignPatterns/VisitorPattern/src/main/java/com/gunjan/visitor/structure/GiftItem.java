package com.gunjan.visitor.structure;

import com.gunjan.visitor.visitors.ItemVisitor;

public class GiftItem implements Item
{
    public int minimalPriceForGift;
    public int originalPrice;
    
    public GiftItem(int minimalPriceForGift, int originalPrice)
    {
        this.minimalPriceForGift = minimalPriceForGift;
        this.originalPrice = originalPrice;
    }
    
    @Override
    public boolean accept(ItemVisitor itemVisitor)
    {
        itemVisitor.visitGiftItem(this);
        return true;
    }
}