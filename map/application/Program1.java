package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if(candidates.containsKey(name)) {
					candidates.put(name, votes + candidates.get(name));
				}
				else {
					candidates.put(name, votes);
				}
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		for(String totalVotes : candidates.keySet()) {
			System.out.println(totalVotes + " - " + candidates.get(totalVotes));
		}
		
		sc.close();

	}

}
