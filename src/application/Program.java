package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		// data/hora atual
		LocalDateTime agora = LocalDateTime.now();

		// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String dataFormatada = formatterData.format(agora);
		
		// formatar a hora
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaFormatada = formatterHora.format(agora);		
		
		
		System.out.print("Title: ");
		String title = scan.nextLine();
		
		System.out.print("Content: ");
		String content = scan.nextLine();		
		
		System.out.println("Likes: ");
		Integer likes = scan.nextInt();
		
		
		String momentString = (dataFormatada + " " + horaFormatada);
		
		scan.close();
		
		
		Post post = new Post(momentString, title, content, likes);
		System.out.println(post);

	}

}
