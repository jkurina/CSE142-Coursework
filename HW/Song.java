//Jonathon Anderson
//CSE142 Assignment#1
//8/13/14

//This program displays the cumulative song described in "handout2."
public class Song {
	public static void main(String[] args) {
		verseOne();
		verseTwo();
		verseThree();
		verseFour();
		verseFive();
		verseSix();
		verseSeven();		
	}
	
//This method prints the end of each verse
	public static void iDie() {
		System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
		System.out.println();
	}

//This method prints the first line of each verse
	public static void there() {
		System.out.print("There was an old woman who swallowed a ");
	}

//This method prints the first verse 
	public static void verseOne() {
		there();
		System.out.println("fly.");
		iDie();
	}

//This method prints the old lady's first solution
	public static void spiderDie() {
		System.out.println("She swallowed the spider to catch the fly,");
      iDie();
	}

//This method prints the second verse
	public static void verseTwo() {
		there();
		System.out.println("spider,\nThat wriggled and iggled and jiggled inside her.");
		spiderDie();
	}

//This method prints the old lady's second solution
	public static void birdDie() {
		System.out.println("She swallowed the bird to catch the spider,");
      spiderDie();
	}

//This method prints the third verse
	public static void verseThree() {
		there();
		System.out.println("bird,\nHow absurd to swallow a bird.");
		birdDie();
	}

//This method prints the old lady's third solution
	public static void catDie() {
		System.out.println("She swallowed the cat to catch the bird,");
      birdDie();
	}

//This method prints the fourth verse
	public static void verseFour() {
		there();
		System.out.println("cat,\nImagine that to swallow a cat.");
		catDie();
	}

//This method prints the old lady's fourth solution
	public static void dogDie() {
		System.out.println("She swallowed the dog to catch the cat,");
      catDie();
	}

//This method prints the fifth verse
	public static void verseFive() {
		there();
		System.out.println("dog,\nWhat a hog to swallow a dog.");
		dogDie();
	}

//This method prints a double entendre ;)
	public static void humanDie() {
		System.out.println("She swallowed the human to catch the Dog,");
      dogDie();
	}

//This method prints the sixth verse
	public static void verseSix() {
		there();
		System.out.println("human,\nHow suggestive!!--she hardly knew him..!");
		humanDie();
	}

//This method prints the seventh verse
	public static void verseSeven() {
		there();
		System.out.println("horse,\nShe died of course.");
	}

}