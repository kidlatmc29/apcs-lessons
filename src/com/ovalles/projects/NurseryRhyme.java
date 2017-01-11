package com.ovalles.projects;

/**
 * Prints out the nursery rhyme "There Was An Old Lady". 
 * 
 * @Isabel Ovalles 
 * Period 2 AP Comp Sci
 * 9/20/16
 * Unit 1
 */

public class NurseryRhyme {
    public static void main(String[] args){
       verseOne();
       refrain();

       blankLine();

       verseTwo();
       refrain();

       blankLine();

       verseThree();
       refrain();

       blankLine();

       verseFour();
       refrain();

       blankLine();

       verseFive();
       refrain();

       blankLine();

       verseSix();

    }
    public static void verseOne(){
        System.out.println("There was an old lady who swallowed a fly.");
    }

    public static void refrain(){
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
    }

    public static void spider(){
        System.out.println("She swallowed the spider to catch the fly,");
    }

    public static void verseTwo(){
        System.out.println("There was an old lady who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        spider();
    }
    public static void verseThree(){
        System.out.println("There was an old lady who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
        bird();
        spider();
    }
    public static void verseFour(){
        System.out.println("There was an old lady who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
        cat();
        bird();
        spider();
    }
    public static void verseFive(){
        System.out.println("There was an old lady who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        System.out.println("She swallowed the dog to catch the cat,");
        cat();
        bird();
        spider();
    }
    public static void verseSix() {
        System.out.println("There was an old lady who swallowed a horse,");
        System.out.println("She died of course.");
    }

    public static void blankLine() {
        System.out.println("");
    }

    public static void bird() {
        System.out.println("She swallowed the bird to catch the spider.");
    }

    public static void cat() {
        System.out.println("She swallowed the cat to catch the bird,");
    }
}
