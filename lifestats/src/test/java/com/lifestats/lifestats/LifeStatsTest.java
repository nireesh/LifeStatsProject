package com.lifestats.lifestats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import com.lifestats.bean.Person;

/**
 * @author Nireesh Thiruveedula
 * 
 */
public class LifeStatsTest {
	/**
	 * Test case to check for years which max number of people are alive,
	 * included duplicates
	 *
	 * input testName name of the test case output
	 */
	@org.junit.Test
	public void testLifeStats() {
		LifeStats ls = new LifeStats();
		Assert.assertEquals(createExpectedData(),
				ls.generateReport(createTestData()));
	}

	public List<Person> createTestData() {
		Person p6 = new Person();
		p6.setBirth(1901);
		p6.setDeath(1909);

		Person p1 = new Person();
		p1.setBirth(1902);
		p1.setDeath(1910);

		Person p2 = new Person();
		p2.setBirth(1901);
		p2.setDeath(1907);

		Person p3 = new Person();
		p3.setBirth(1910);
		p3.setDeath(1913);

		Person p4 = new Person();
		p4.setBirth(1912);
		p4.setDeath(1916);

		Person p5 = new Person();
		p5.setBirth(1950);
		p5.setDeath(1999);

		List<Person> ps = new ArrayList<Person>();
		ps.addAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		return ps;
	}

	public List<Integer> createExpectedData() {
		List<Integer> years = new ArrayList<Integer>();
		years.addAll(Arrays.asList(1902, 1903, 1904, 1905, 1906));
		return years;
	}
}
