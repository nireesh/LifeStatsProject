package com.lifestats.lifestats;

import java.util.ArrayList;
import java.util.List;

import com.lifestats.bean.Person;

/**
 * @author Nireesh Thiruveedula
 * @version 1.0
 *
 */
public class LifeStats {

	/**
	 * 
	 * Method to check for the year in which max people are alive, included duplicates. Output can be multiple years
	 * @param persons List<Persons>
	 * @return List<Integer> - Years
	 */
	public List<Integer> generateReport(List<Person> persons) {
		int[] stats = new int[100];
		for (Person p : persons) {
			int birth = p.getBirth();
			int death = p.getDeath();
			updateStats(birth, death, stats);
		}
		int largest = stats[0];
		for (int i = 0; i < stats.length; i++) {
			if (stats[i] > largest) {
				largest = stats[i];
			}
		}
		ArrayList<Integer> years = new ArrayList<Integer>();
		for (int k = 0; k < 100; k++) {
			if (stats[k] == largest) {
				years.add(1900 + k);
			}
		}
		return years;
	}

	/**
	 * 
	 * @param birth
	 * @param death
	 * @param stats
	 */
	private void updateStats(int birth, int death, int[] stats) {
		for (int i = birth - 1900; i < death - 1900; i++) {
			stats[i] += 1;
		}
	}
}
