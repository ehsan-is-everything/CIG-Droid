package replacement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import parser.LayoutInfo;

public class Replace {

	private static LayoutInfo layout;

	public static void main(String[] args) throws Exception {
		String thisLine = null;

		try {

			// open input stream test.txt for reading purpose.
			String file;
			BufferedReader br = new BufferedReader(new FileReader("FileName"));

			while ((thisLine = br.readLine()) != null) {
				for (int i = 0; i < layout.getViewLength(); i++) {

					if (thisLine.indexOf("findViewById(R.id."
							+ layout.getView(i).getId() + ");") > 0) {
						
						
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
