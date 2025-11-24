package org.lolhens.skylands.client

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.fml.client.IModGuiFactory

import java.util.Collections

class SkylandsGuiFactory extends IModGuiFactory {
  override def initialize(minecraftInstance: Minecraft): Unit = ()

  override def hasConfigGui(): Boolean = true

  override def createConfigGui(parent: GuiScreen): GuiScreen = new SkylandsConfigGui(parent)

  override def runtimeGuiCategories(): java.util.Set[IModGuiFactory.RuntimeOptionCategoryElement] = Collections.emptySet[IModGuiFactory.RuntimeOptionCategoryElement]()

  // no runtime handlers
}
