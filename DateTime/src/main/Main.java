package main;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws ParseException {
		LocalDate d01 = LocalDate.now(); //local, sem horario
		LocalDateTime d02 = LocalDateTime.now(); //local, com horario
		Instant d03 = Instant.now();
		
		System.out.println("D01 - " + d01 + "\nD02- " + d02 + "\nD03- " + d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:25");
		Instant d06 = Instant.parse("2022-07-20T01:30:25Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:25-03:00");
		System.out.println("D04- " + d04 +"\nD05- " +d05 +"\nD06 -" + d06 + "\nD07 - " + d07);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //posso passar o formatador direto como parametro
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d08 = LocalDate.parse("22/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		System.out.println("D08- " + d08 +"\nD09- " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 07, 22);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 22, 1, 30);
		
		System.out.println("D10- "+d10+"\nD11- "+ d11);
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("D09- " + d09.format(fmt3));
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		//para imprimir Instant eh necessario especificar um fuso
		System.out.println("D07- " + fmt4.format(d07));
		
		//CONVERTER DATA GLOBAL PARA LOCAL
		//-> Data-Hora global
		LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime res2 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("R1 = " + res1);
		System.out.println("R2 = " + res2);
		
		
		//CALCULOS COM DATA E HORA
		//Data-hora +/- tempo -> Data-Hora
		LocalDate d12 = LocalDate.parse("2022-07-20");
		LocalDate pastWeekLocalDate = d12.minusDays(7);
		LocalDate nextWeekLocalDate = d12.plusDays(7);
		System.out.println("Past week " + pastWeekLocalDate + "\nNext week " + nextWeekLocalDate);

		//para instant
		Instant d13 = Instant.parse("2022-07-20T01:30:25Z");
		Instant pastWeekInstant = d13.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d13.plus(7, ChronoUnit.DAYS);
		System.out.println("Past week instant " + pastWeekInstant + "\nNext week instant " + nextWeekInstant);
		
		//Data-hora1 , Data-hora2 -> Duracao
		Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
		//Duration t2 = Duration.between(nextWeekLocalDate, pastWeekLocalDate);
		
		System.out.println("T1 " + t1.toHours());
		
		//ANTERIOR AO JAVA 8
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date y1 = sdf1.parse("25/04/2023");
		Date y2 = sdf2.parse("25/04/2023 16:20");
		
		Date x1 = new Date();
		System.out.println(" y1: " + sdf2.format(y1));
		System.out.println("\n y2: " + sdf2.format(y2));
		System.out.println(x1);
		
		
		
	}

}
