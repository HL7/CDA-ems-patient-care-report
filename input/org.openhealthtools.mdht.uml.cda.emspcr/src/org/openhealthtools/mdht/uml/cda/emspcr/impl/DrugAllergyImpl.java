/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

import org.eclipse.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DrugAllergyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DrugAllergyImpl extends ObservationImpl implements DrugAllergy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrugAllergyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DRUG_ALLERGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugAllergyParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAllergyOperations.validateDrugAllergyParticipant1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugAllergyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAllergyOperations.validateDrugAllergyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugAllergyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAllergyOperations.validateDrugAllergyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugAllergyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAllergyOperations.validateDrugAllergyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrugAllergyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DrugAllergyOperations.validateDrugAllergyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugAllergy init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DrugAllergy init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // DrugAllergyImpl
