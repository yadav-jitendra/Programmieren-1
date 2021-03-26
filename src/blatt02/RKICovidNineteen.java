package blatt02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RKICovidNineteen {

	private static final String FILE_NAME = "RKI_COVID19.csv";

	private List<List<String>> covidData;

	public RKICovidNineteen() {
		covidData = new ArrayList<>();
	}

	private void readCSV() {
		File file = new File(FILE_NAME);
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(file);
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				if (!line.isBlank()) {
					String[] values = line.strip().split(",");
					covidData.add(Arrays.asList(values));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}

	}

	public List<List<String>> getCovidData() {
		readCSV();
		return this.covidData;
	}

	public int getTotalCovidRecovery() {
		readCSV();
		List<List<String>> covidDataCopy = covidData.stream().skip(1).collect(Collectors.toList());
		int totalRecoveryCount = 0;
		if (covidData.size() > 0) {
			int columnIndex = 0;
			for (String column : covidData.get(0)) {
				if (column.equals("AnzahlGenesen")) {
					break;
				}
				columnIndex++;
			}
			for (List<String> line : covidDataCopy) {
				String temp = line.get(columnIndex);
				int recoveryCount = Integer.parseInt(temp);
				totalRecoveryCount += recoveryCount;
			}
		}

		return totalRecoveryCount;
	}

}
