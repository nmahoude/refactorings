package refactorings.improving.codesmells.duplicatedcode;

/**
 *
 * If you see the same code in different places, 
 * it's a sign that you need to unify them 
 * because the code will need to be modified at different places if changes is to be made.
 * 
 * @note : be aware of accidental duplication, 
 *         some time it's better to leave the same code at 2 different places 
 *         if the code may change differently or at different times
 *
 * Refactorings:
 * @see Extract function
 * @see Slide Statements
 * @see Pull up method
 *
 */
public interface DuplicatedCode {

}
