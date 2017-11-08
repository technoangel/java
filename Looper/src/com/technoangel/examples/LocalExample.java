package com.technoangel.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class LocalExample {
	public void main(String[] args) {
		LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDateTime date2 = LocalDateTime.of(2017, Month.JUNE, 1, 1, 1);
		// This doesn't compile because it doesn't like LocalDateTime, just LocalDate
		Period p = Period.between(date1, date2);
		System.out.print(p.getYears() + ":" + p.getMonths() + ":" + p.getDays());
	}
}
