package org.lolhens.skylands.client

import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.common.config.ConfigElement
import net.minecraftforge.fml.client.config.{GuiConfig, IConfigElement}
import org.lolhens.skylands.SkylandsMod

class SkylandsConfigGui(parent: GuiScreen) extends GuiConfig(
  parent,
  new ConfigElement(SkylandsMod.skylands.config.configuration.getCategory("General")).getChildElements.asInstanceOf[java.util.List[IConfigElement]],
  SkylandsMod.ModId,
  false,
  false,
  "Skylands Mod Configuration"
)
