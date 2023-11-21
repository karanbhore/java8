package com.prowings.interviews_program;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Next_OccuringDate {

	public static void main(String[] args) {
		
		
		LocalDate local=LocalDate.now();
		System.out.println(local);

		LocalDate with = local.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(with);
		
	}
}
