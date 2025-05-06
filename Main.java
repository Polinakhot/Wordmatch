public class Main {
    public static void main(String[] args) {

        Wordmatch game1 = new Wordmatch("mississippi");

        System.out.println("Score for 'i': " + game1.scoreGuess("i"));                
        System.out.println("Score for 'iss': " + game1.scoreGuess("iss"));             
        System.out.println("Score for 'issip': " + game1.scoreGuess("issip"));        
        System.out.println("Score for 'mississippi': " + game1.scoreGuess("mississippi")); 

    
        Wordmatch game2 = new Wordmatch("aaaabb");

        System.out.println("Score for 'a': " + game2.scoreGuess("a"));                 
        System.out.println("Score for 'aa': " + game2.scoreGuess("aa"));               
        System.out.println("Score for 'aaa': " + game2.scoreGuess("aaa"));             
        System.out.println("Score for 'aabb': " + game2.scoreGuess("aabb"));           
        System.out.println("Score for 'c': " + game2.scoreGuess("c"));                

        Wordmatch game3 = new Wordmatch("concatenation");

        System.out.println("findBetterGuess('ten', 'nation'): " + game3.findBetterGuess("ten", "nation")); 
        System.out.println("findBetterGuess('con', 'cat'): " + game3.findBetterGuess("con", "cat"));       
    }
}
