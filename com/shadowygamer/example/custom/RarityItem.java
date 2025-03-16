package com.shadowygamer.example.custom;

import com.shadowygamer.objects.Player;
import com.shadowygamer.objects.player.Item;

abstract public class RarityItem extends Item {
    public final Rarities rarity;

    public RarityItem(String pName, String pType, Player pPlayer, Rarities pRarity) {
        super(pName, pType, pPlayer);
        rarity = pRarity;
    }

    public Rarities getRarity() {
        return rarity;
    }
}
