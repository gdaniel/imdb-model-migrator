/**
 */
package movies;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link movies.RootElement#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see movies.MoviesPackage#getRootElement()
 * @model
 * @generated
 */
public interface RootElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link movies.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see movies.MoviesPackage#getRootElement_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getContent();

} // RootElement
