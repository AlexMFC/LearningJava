package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner (System.in);
		
		SimpleDateFormat fmt1 = new SimpleDateFormat ("dd/MM/yyyy HH:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thatT's awesome!");
		
		System.out.println("Type the post`s title");
		String title = keyboard.nextLine();
		System.out.println();
		System.out.println("Type the post`s content");
		String content = keyboard.nextLine();
		System.out.println("How many likes?");
		Integer likes = keyboard.nextInt();
		
		Post post = new Post(fmt1.parse("21/06/2018 13:05:44"), title, content, likes );
		post.addComment(c1);
		post.addComment(c2);
		
		System.out.println(post.toString());
		
		
		
		
		keyboard.close();

	}

}
