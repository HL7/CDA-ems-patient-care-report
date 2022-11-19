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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfKnownNonDrugAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfKnownNonDrugAllergyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Known Non Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistenceOfKnownNonDrugAllergyImpl extends ObservationImpl implements ExistenceOfKnownNonDrugAllergy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfKnownNonDrugAllergyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_KNOWN_NON_DRUG_ALLERGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownNonDrugAllergyTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownNonDrugAllergyMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownNonDrugAllergyCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownNonDrugAllergyCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfKnownNonDrugAllergyValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExistenceOfKnownNonDrugAllergyOperations.validateExistenceOfKnownNonDrugAllergyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfKnownNonDrugAllergy init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExistenceOfKnownNonDrugAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ExistenceOfKnownNonDrugAllergyImpl
