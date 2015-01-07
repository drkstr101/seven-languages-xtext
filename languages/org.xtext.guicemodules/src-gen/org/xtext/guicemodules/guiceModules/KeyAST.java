/**
 */
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.KeyAST#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.KeyAST#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getKeyAST()
 * @model
 * @generated
 */
public interface KeyAST extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(XAnnotation)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getKeyAST_Annotation()
   * @model containment="true"
   * @generated
   */
  XAnnotation getAnnotation();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.KeyAST#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(XAnnotation value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getKeyAST_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.KeyAST#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // KeyAST
