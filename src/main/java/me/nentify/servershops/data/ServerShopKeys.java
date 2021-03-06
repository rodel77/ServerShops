package me.nentify.servershops.data;

import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.key.KeyFactory;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.item.inventory.ItemStack;

public class ServerShopKeys {

    public static final Key<Value<String>> SHOP_TYPE = KeyFactory.makeSingleKey(String.class, Value.class, DataQuery.of("ShopType"));
    public static final Key<Value<ItemStack>> ITEM = KeyFactory.makeSingleKey(ItemStack.class, Value.class, DataQuery.of("ItemStack"));
    public static final Key<Value<Double>> PRICE = KeyFactory.makeSingleKey(Double.class, Value.class, DataQuery.of("Price"));
    public static final Key<Value<Integer>> QUANTITY = KeyFactory.makeSingleKey(Integer.class, Value.class, DataQuery.of("Quantity"));
}
