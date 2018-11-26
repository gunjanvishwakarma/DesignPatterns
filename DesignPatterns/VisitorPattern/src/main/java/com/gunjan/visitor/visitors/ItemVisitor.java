package com.gunjan.visitor.visitors;


import com.gunjan.visitor.structure.DiscountedItem;
import com.gunjan.visitor.structure.GiftItem;
import com.gunjan.visitor.structure.RegularItem;

public interface ItemVisitor
{
    void visitGiftItem(GiftItem mailClient);
    
    void visitRegularItem(RegularItem mailClient);
    
    void visitDiscountedItem(DiscountedItem mailClient);
}
