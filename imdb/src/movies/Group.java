/**
 */
package movies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link movies.Group#getCommonMovies <em>Common Movies</em>}</li>
 *   <li>{@link movies.Group#getAvgRating <em>Avg Rating</em>}</li>
 * </ul>
 *
 * @see movies.MoviesPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends Element {
	/**
	 * Returns the value of the '<em><b>Common Movies</b></em>' reference list.
	 * The list contents are of type {@link movies.Movie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Movies</em>' reference list.
	 * @see movies.MoviesPackage#getGroup_CommonMovies()
	 * @model
	 * @generated
	 */
	EList<Movie> getCommonMovies();

	/**
	 * Returns the value of the '<em><b>Avg Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Rating</em>' attribute.
	 * @see #setAvgRating(double)
	 * @see movies.MoviesPackage#getGroup_AvgRating()
	 * @model
	 * @generated
	 */
	double getAvgRating();

	/**
	 * Sets the value of the '{@link movies.Group#getAvgRating <em>Avg Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Rating</em>' attribute.
	 * @see #getAvgRating()
	 * @generated
	 */
	void setAvgRating(double value);

} // Group
