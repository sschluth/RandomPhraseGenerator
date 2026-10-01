package comprehensive;

import java.io.File;

/**
 * Generates random phrases using the rules defined in an input grammar file.
 * 
 * The first command-line argument specifies the path to the grammar file, and
 * the second command-line argument specifies the number of phrases to generate.
 * Each generated phrase is printed on its own line.
 * 
 * @author Sophia Schluth and Tanishka Bista
 * @version 7.28.2026
 */
public class RandomPhraseGenerator {
	
	/**
	 * Runs the random phrase generator.
	 *
	 * @param args command-line arguments where {@code args[0]} is the path to
	 *             the grammar file and {@code args[1]} is the number of phrases
	 *             to generate
	 */
	public static void main(String[] args) {
		File file = new File(args[0]);
		int numOfPhrases = Integer.parseInt(args[1]);
		
		Grammar grammar = new Grammar(file);
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < numOfPhrases; i++) {
			output.append(grammar.generatePhrase());
			
			if (i < numOfPhrases - 1) {
				output.append('\n');
			}
		}
		
		System.out.println(output);
	}
}
