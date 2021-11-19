import celldetection._3D_objects_counter;
import ij.IJ;
import ij.ImagePlus;
import ij.WindowManager;
import ij.plugin.PlugIn;
import imageJ.plugins.PoorMan3DReg_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CalciumSignal_ implements PlugIn {

    public void run(String arg) {
        IJ.showMessage("Calcium Signal", "Welcome to the Calcium Signal plugin!");

        try {
            /*
            ProcessBuilder processBuilder = new ProcessBuilder("python", "test.py");
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

             */
            // test.py should be in scripts
            // IJ.run("Scripts/test_.py");
            // IJ.runMacro("test_.py");
            Runtime run = Runtime.getRuntime();
            String[] arguments = {"python", "test_.py"};
            run.exec(arguments);
            IJ.log("process started");
        } catch (Exception ex) {
            // System.out.println("Error.");
            IJ.log(ex.getMessage());
        }

        /*
        int imageCount = WindowManager.getImageCount();
        int[] idList = WindowManager.getIDList();
        PoorMan3DReg_ reg = new PoorMan3DReg_();
        _3D_objects_counter counter = new _3D_objects_counter();

        if (imageCount < 1) {
            IJ.showMessage("Calcium Signal", "No image found.");
            return;
        }

        for (int id : idList) {
            ImagePlus img = WindowManager.getImage(id);
            WindowManager.setTempCurrentImage(img);
            reg.run(arg);
            counter.run(arg);
        }

         */

    }

    public static void main(String[] args) {
        // sanity check
        // System.out.println("Hello, world!");
        /*
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("python", "test.py");
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
        } catch (IOException ex) {
            System.out.println("Error.");
        }

         */
    }
}
