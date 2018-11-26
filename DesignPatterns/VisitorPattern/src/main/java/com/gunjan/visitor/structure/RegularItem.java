package com.gunjan.visitor.structure;

import com.gunjan.visitor.visitors.ItemVisitor;

public class RegularItem implements Item
{
    public int price;
    
    public RegularItem(int price)
    {
        this.price = price;
    }
    
    @Override
    public boolean accept(ItemVisitor itemVisitor)
    {
        itemVisitor.visitRegularItem(this);
        return true;
    }
}
