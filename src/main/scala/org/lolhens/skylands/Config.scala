package org.lolhens.skylands

import java.io.File

import net.minecraftforge.common.config.Configuration

/**
  * Created by pierr on 01.01.2017.
  */
class Config(configFile: File) {
  val configuration: Configuration = new Configuration(configFile)
  configuration.load()

  val dimensionId: Int = configuration.get("IDs", "Dimension Id", 50, "Id of the skylands dimension").getInt

  // Whether players should be teleported into the Skylands dimension when they join (disabled by default)
  def spawnOnJoin: Boolean = configuration.get("General", "spawnOnJoin", false, "When true, players will be teleported to the Skylands when they join").getBoolean

  // keep the config file up-to-date
  configuration.save()
}
