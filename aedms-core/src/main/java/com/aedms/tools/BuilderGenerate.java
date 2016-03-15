package com.aedms.tools;

import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.LandingGear;

import uk.co.buildergenerator.BuilderGenerator;

/**
 * To Auto Generate the Builder for Entities
 * 
 * @author mwang
 *
 */
public class BuilderGenerate {

	public static void main(String[] args) {
		 BuilderGenerator bg = new BuilderGenerator(LandingGear.class);
		 bg.setBuilderPackage("com.aedms.core.entities.source");  

		 bg.generateBuilders();
	}

}
