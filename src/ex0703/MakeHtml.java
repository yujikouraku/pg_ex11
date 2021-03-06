package ex0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeHtml {
	public static void main(String[] args) {
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html>");
		System.out.println("<head>");
		System.out.println("<title>My Page</title>");
		System.out.println("<¥head>");
		System.out.println("<body>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line= reader.readLine();
			while (line  != null){
				System.out.println(line.indexOf("■"));

				if (line.indexOf("■") == 0) {
					line = line.substring(1);
					System.out.println("<h1>" + line + "</h1>");
				}else if(line.indexOf("●") == 0){
					line = line.substring(1);
					System.out.println("<h2>" + line + "</h2>");
				}else {
					System.out.println("<p>" + line + "</p>");
				}
				line = reader.readLine();
			}

		} catch (IOException e) {
		}
		System.out.println("</body>");
		System.out.println("</html>");
	}

}
