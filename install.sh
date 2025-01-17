#!/bin/bash

# Put the absolute or relative path to your ImageJ/Fiji installation here.
# If relative, make sure it's relative to the root directory of this project.
imageJ=../Fiji.app

mvn clean package
cp target/classes/CalciumSignal_.class plugin
cp src/main/java/CalciumSignal_.java plugin
cp target/classes/custom_roiManager.class plugin
cp src/main/java/custom_roiManager.java plugin
cp target/classes/Cell.class plugin
cp src/main/java/Cell.java plugin
cp target/classes/CellManager.class plugin
cp src/main/java/CellManager.java plugin
cp target/classes/PeakManager.class plugin
cp src/main/java/PeakManager.java plugin
cp target/classes/menu.class plugin
cp src/main/java/menu.java plugin
cp target/classes/menu\$1.class plugin
# Uncomment below line if you needed to recompile any of the imageJ plugins files
cp target/classes/imageJ/plugins/* plugin/imageJ/plugins
cp -r target/classes/celldetection plugin
cd plugin
jar cvfM CalciumSignal_.jar CalciumSignal_.class CalciumSignal_.java custom_roiManager.class custom_roiManager.java Cell.class Cell.java CellManager.class CellManager.java PeakManager.class PeakManager.java menu.class menu.java menu\$1.class imageJ/plugins/*.class celldetection/*.class celldetection/Objects3D/*.class celldetection/Watershed3D/*.class plugins.config
cd ..
cp plugin/CalciumSignal_.jar $imageJ/plugins
cp -r pythonscript $imageJ/plugins/CalciumSignal
