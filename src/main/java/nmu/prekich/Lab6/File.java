package nmu.prekich.Lab6;

import com.google.gson.Gson;
        import com.google.gson.GsonBuilder;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.logging.Level;
        import java.util.logging.Logger;

public class File{
    private Matrix restoredMatrix = null;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();;

    public File(String filename, String fileJson) {

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(fileJson);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(filename));
            restoredMatrix = gson.fromJson(reader, Matrix.class);

        } catch (IOException ex) {
            Logger.getLogger(File.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public Matrix getRestoredMatrix() {
        return restoredMatrix;
    }
}
