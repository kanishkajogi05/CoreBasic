package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class Question1 {
public static void main (String[]args) {
		
		LocalDate l=LocalDate.of(2002, 06,13);
		LocalDate now =LocalDate.now();

		System.out.println(l);
		System.out.println(now);

		Period difference = Period.between(l, now );
		System.out.println(difference);
		System.out.println("Year "+difference.getYears());
		System.out.println("Month "+difference.getMonths());
		System.out.println("Day "+difference.getDays());

		}

		}

