package com.aedms.tools;

import com.aedms.core.entities.source.EngineOprRec;

import uk.co.buildergenerator.BuilderGenerator;

/**
 * To Auto Generate the Builder for Entities
 * 
 * @author mwang
 *
 */
public class BuilderGenerate {

	public static void main(String[] args) {
		 BuilderGenerator bg = new BuilderGenerator(EngineOprRec.class);
		 bg.setBuilderPackage("com.aedms.core.entities.source");  

		 bg.generateBuilders();
	}

}
