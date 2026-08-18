package org.extrateam.java

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.inventory.ShapelessRecipe
import org.bukkit.plugin.java.JavaPlugin

class ExtraRecipe : JavaPlugin() {

    override fun onEnable() {

        registerEnchantedGoldenApple()
        registerNetherWart()

        logger.info("ExtraRecipe enabled!")
    }

    private fun registerEnchantedGoldenApple() {

        val result = ItemStack(
            Material.ENCHANTED_GOLDEN_APPLE
        )

        val key = NamespacedKey(
            this,
            "enchanted_golden_apple"
        )

        val recipe = ShapedRecipe(
            key,
            result
        )

        recipe.shape(
            "AAA",
            "ABA",
            "AAA"
        )

        recipe.setIngredient(
            'A',
            Material.GOLD_BLOCK
        )

        recipe.setIngredient(
            'B',
            Material.APPLE
        )

        server.addRecipe(recipe)
    }

    private fun registerNetherWart() {

        val result = ItemStack(
            Material.NETHER_WART,
            9
        )

        val key = NamespacedKey(
            this,
            "nether_wart_block_to_nether_wart"
        )

        val recipe = ShapelessRecipe(
            key,
            result
        )

        recipe.addIngredient(
            Material.NETHER_WART_BLOCK
        )

        server.addRecipe(recipe)
    }

    override fun onDisable() {
    }
}