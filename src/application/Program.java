package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Students> set = new HashSet<>();
		
		System.out.print("How many students for course A?:");
		Integer n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			char course = 'A';
			Integer id = sc.nextInt();
			set.add(new Students(id, course));
		}
		
		System.out.print("How many students for course B?:");
		Integer n1 = sc.nextInt();
		for(int i = 1; i <= n1; i++) {
			char course = 'B';
			Integer id = sc.nextInt();
			set.add(new Students(id, course));
		}
		
		System.out.print("How many students for course C?:");
		Integer n2 = sc.nextInt();
		for(int i = 1; i <= n2; i++) {
			char course = 'C';
			Integer id = sc.nextInt();
			set.add(new Students(id, course));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
