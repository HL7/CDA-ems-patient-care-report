/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NonDrugAllergyImpl extends ObservationImpl implements NonDrugAllergy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonDrugAllergyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.NON_DRUG_ALLERGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonDrugAllergyValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return NonDrugAllergyOperations.validateNonDrugAllergyValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonDrugAllergy init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NonDrugAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // NonDrugAllergyImpl
