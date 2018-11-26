package com.gunjan.visitor.structure;

import com.gunjan.visitor.visitors.ItemVisitor;

public interface Item
{
    boolean accept(ItemVisitor itemVisitor);
}
