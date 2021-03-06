package dev.technici4n.fasttransferlib.api.item;

import dev.technici4n.fasttransferlib.impl.item.ItemImpl;
import dev.technici4n.fasttransferlib.impl.item.compat.vanilla.VanillaCompat;
import org.jetbrains.annotations.NotNull;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import net.fabricmc.fabric.api.provider.v1.block.BlockApiLookup;
import net.fabricmc.fabric.api.provider.v1.block.BlockApiLookupRegistry;

public class ItemApi {
	public static final BlockApiLookup<ItemIo, @NotNull Direction> SIDED =
			BlockApiLookupRegistry.getLookup(new Identifier("fasttransferlib:sided_item_io"), ItemIo.class, Direction.class);
	public static final BlockApiLookup<ItemIo, Void> UNSIDED =
			BlockApiLookupRegistry.getLookup(new Identifier("fasttransferlib:unsided_item_io"), ItemIo.class, Void.class);

	static {
		VanillaCompat.init();
		ItemImpl.loadLbaCompat();
	}
}
