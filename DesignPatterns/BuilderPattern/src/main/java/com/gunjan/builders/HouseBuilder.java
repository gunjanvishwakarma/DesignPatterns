package com.gunjan.builders;

import com.gunjan.product.House;

public interface HouseBuilder
{
    void buildFoundation();
    
    void buildStructure();
    
    void buildRoof();
    
    void paintHouse();
    
    void furnishHouse();
    
    House getHouse();
}
