//Jonathon Anderson
//CSE142 Assignment#1
//8/13/14

//Cumulative song as described in handout#2

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
	
	public static void iDie() {
		System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
		System.out.println();
	}

	public static void there() {
		System.out.print("There was an old woman who swallowed a ");
	}

	public static void verseOne() {
		there();
		System.out.println("fly.");
		iDie();
	}

	public static void spiderDie() {
		System.out.println("She swallowed the spider to catch the fly,");
      iDie();
	}

	public static void verseTwo() {
		there();
		System.out.println("spider,\nThat wriggled and iggled and jiggled inside her.");
		spiderDie();
	}

	public static void birdDie() {
		System.out.println("She swallowed the bird to catch the spider,");
      spiderDie();
	}

	public static void verseThree() {
		there();
		System.out.println("bird,\nHow absurd to swallow a bird.");
		birdDie();
	}

	public static void catDie() {
		System.out.println("She swallowed the cat to catch the bird,");
      birdDie();
	}

	public static void verseFour() {
		there();
		System.out.println("cat,\nImagine that to swallow a cat.");
		catDie();
	}

	public static void dogDie() {
		System.out.println("She swallowed the dog to catch the cat,");
      catDie();
	}

	public static void verseFive() {
		there();
		System.out.println("dog,\nWhat a hog to swallow a dog.");
		dogDie();
	}

	public static void humanDie() {
		System.out.println("She swallowed the human to catch the Dog,");
      dogDie();
	}

	public static void verseSix() {
		there();
		System.out.println("human,\nHow suggestive!!--she hardly knew him..!");
		humanDie();
	}

	public static void verseSeven() {
		there();
		System.out.println("horse,\nShe died of course.");
	}

}