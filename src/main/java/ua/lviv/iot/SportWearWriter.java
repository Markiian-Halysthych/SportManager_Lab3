package ua.lviv.iot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class SportWearWriter {
	public static void writeToFile(ArrayList<Wear> listToWrite) throws IOException {
		final File myFile = new File("WearList");
		try (FileOutputStream fos = new FileOutputStream(myFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bufferedWriter = new BufferedWriter(osw)) {

            for (@SuppressWarnings("unused") Wear wear: listToWrite) {
                bufferedWriter.write(Wear.getHeaders() + "\n");
                bufferedWriter.write(Wear.toCSV() + "\n");
	
            }

		}
		}
}
