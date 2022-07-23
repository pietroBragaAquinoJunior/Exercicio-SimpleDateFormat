package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		/* O programa printa em dois formatos diferentes a data de hoje. */
		/* O programa também recebe datas do usuário e mostra em dois formatos diferentes */
		/* O programa também recebe datas UTC e mostra em dois formatos diferentes */
		/* Exercício feito em Java para praticar Date, SimpleDateFormat, parse, */
		/* format e Date.from(Instant.parse()) e Calendar.getInstance() */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date hoje = new Date();
		
		System.out.println("Hoje: ");
		System.out.println(sdf1.format(hoje));
		System.out.println(sdf2.format(hoje));
		
		System.out.println("Digite uma data no formato dia/mes/ano :");
		Scanner sc = new Scanner(System.in);
		String dataDigitadaString = sc.next();
		
		Date dataDigitada = sdf1.parse(dataDigitadaString);
		
		System.out.println("Você digitou: ");
		System.out.println(sdf1.format(dataDigitada));
		System.out.println(sdf2.format(dataDigitada));
		
		System.out.println("Agora em UTC, digite uma data neste padrão: ano-mes-diaThora:minuto:segundoZ    Não esqueça o T e o Z.");
		String dataDigitadaString2 = sc.next();
		
		Date dataDigitada2 = Date.from(Instant.parse(dataDigitadaString2));
		
		System.out.println("Você digitou: ");
		System.out.println(sdf1.format(dataDigitada2));
		System.out.println(sdf2.format(dataDigitada2));
		
		System.out.println("Agora vamos somar 10 horas na sua primeira data digitada: ");
		System.out.println("Você havia digitado: ");
		System.out.println(sdf1.format(dataDigitada));
		System.out.println(sdf2.format(dataDigitada));
		System.out.println("Com +10 horas: ");
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataDigitada);
		calendario.add(calendario.HOUR_OF_DAY, 10);
		Date novaDataDigitada = calendario.getTime();
		
		System.out.println(sdf1.format(novaDataDigitada));
		System.out.println(sdf2.format(novaDataDigitada));
		
		sc.close();
		
	}

}
