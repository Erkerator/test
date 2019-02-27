import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt extends WriteToFile {

    private static final WriteToTxt INSTANCE = new WriteToTxt();

    private WriteToTxt(){}

    public static WriteToTxt getInstance() {
        return INSTANCE;
    }

    @Override
    public void writeToFile(List<Numbers> listOfNumbers, String fileName) {
        StringBuilder resultText = new StringBuilder();
        for (Numbers element:listOfNumbers){
            resultText.append(element);
            resultText.append("\n");
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            bufferedWriter.write(resultText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
