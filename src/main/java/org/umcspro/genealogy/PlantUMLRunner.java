package org.umcspro.genealogy;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class PlantUMLRunner {
    public static <OutputFileName> void GenerateDiagram(String UMLData, String outputDirpath, String outputFileName){
        File file = new File(outputDirpath + outputFileName + ".txt");
        try{
        FileWriter fileWriter = new FileWriter(outputFileName);
        fileWriter.write((UMLData));
        fileWriter.close();
        String command = "java " + "-jar" + plantUMLPath + " -charset UTF-8 " + outputFileName.getPath() + " -o " + outputDirpath + outputFileName
    Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


