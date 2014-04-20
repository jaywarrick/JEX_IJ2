package main;
/*
 * To the extent possible under law, the Fiji developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

import imagej.ImageJ;
import imagej.command.Command;
import imagej.command.CommandInfo;
import imagej.menu.MenuConstants;

import java.util.List;

import org.scijava.InstantiableException;
import org.scijava.plugin.Menu;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;
import org.scijava.plugin.PluginInfo;

/**
 * ProcessPixels
 *
 * A template for processing each pixel of either
 * GRAY8, GRAY16, GRAY32 or COLOR_RGB images.
 *
 * @author The Fiji Team
 */
@Plugin(type = Command.class, name = "JEX", menu = {
	@Menu(label = MenuConstants.PLUGINS_LABEL, weight = MenuConstants.PLUGINS_WEIGHT,
			mnemonic = MenuConstants.PLUGINS_MNEMONIC),
			@Menu(label = "JEX", weight = 28, accelerator = "^J") }, headless = true)
public class JEX_IJ2Command implements Command {
	
	@Parameter
	ImageJ ij;
	
	@Override
	public void run()
	{
		System.out.println("This is the start of JEX");
	}
	
	/**
	 * Main method for debugging.
	 *
	 * For debugging, it is convenient to have a method that starts ImageJ, loads an
	 * image and calls the plugin, e.g. after setting breakpoints.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		// set the plugins.dir property to make the plugin appear in the Plugins menu
		ImageJ ij = new ImageJ();
		ij.ui().showUI();
		//		List<PluginInfo<Command>> plugins = ij.plugin().getPluginsOfType(Command.class);
		//		
		//		for(PluginInfo<Command> info : plugins)
		//		{
		//			Class<? extends Command> pluginClass;
		//			try
		//			{
		//				pluginClass = info.loadClass();
		//				CommandInfo jexInfo = new CommandInfo(info);
		//				System.out.println(jexInfo.getName());
		//				System.out.println(info.toString());
		//			}
		//			catch (InstantiableException e)
		//			{
		//				e.printStackTrace();
		//			}
		//		}
		
		//ij.command().run("main.JEX_IJ2Command", true, new Object[]{});
	}
	
}
